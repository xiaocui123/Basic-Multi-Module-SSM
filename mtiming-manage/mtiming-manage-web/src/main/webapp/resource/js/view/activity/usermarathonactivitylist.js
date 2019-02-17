$(function () {
    //设置选中背景色
    $('#grid').on('click-row.bs.table', function (e, row, $element) {
        $('.success').removeClass('success');
        $($element).addClass('success');
    });

    $('.form_datetime').each(function () {
        var getTimeId = $(this).find("input");
        setTimer = {
            pickerPosition: "bottom-left",
            autoclose: true,
            format: 'yyyy-mm-dd hh:ii',
            pickDate: true,
            pickTime: true,
            hourStep: 1,
            minView: 1,
            minuteStep: 5
        }
        getTimeId.datetimepicker(setTimer);
    });

    $('#activity-update-btn').click(function(){
        gridBtnUpdate();
    })

    $('#saveActivityBtn').click(function () {
        saveActivity();
    });

    //初始化赛事select
    (function () {
        $.get(path + '/userMarathonActivity/queryAllMarthon',function(response){
            if(response.status!='000'){
                bootbox.alert("获取系统平台信息失败!");
            }else{
                initMarathons(response);
            }
        });
        function initMarathons(data) {
            var marathons=data.object;
            var html = '';
            for (var i = 0; i < marathons.length; i++) {
                html += '<option value="' + marathons[i].marathonUuid + '">' + marathons[i].marathonName + '</option>'
            }
            $('#marathon_select').html(html);

            $("#marathon_select").val(marathons[0].marathonUuid);
        }
    }());

    $("#marathon_select").change(function() {
        $('#_grid').treegrid('reload');
    });


    $("#file-0a").fileinput({
        language: 'zh', //设置语言
        uploadUrl: path + "/fileresource/add", //上传的地址
        uploadAsync: true, //默认异步上传
        showUpload: true, //是否显示上传按钮
        showRemove: true, //显示移除按钮
        showPreview: false, //是否显示预览
        showCaption: true,//是否显示标题
        browseClass: "btn btn-primary", //按钮样式
        dropZoneEnabled: false,//是否显示拖拽区域
        maxFileCount: 1, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount: true,
        uploadExtraData: function(previewId, index) {
            var data = {
                activityId : $("#activityId").val(),
            };
            return data;
        },
    });

    $('#file-0a').on('fileuploaderror', function (event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
            response = data.response, reader = data.reader;
        console.log(data);
        console.log('File upload error');
    });

    $('#file-0a').on('fileerror', function (event, data) {
        console.log(data.id);
        console.log(data.index);
        console.log(data.file);
        console.log(data.reader);
        console.log(data.files);
    });

    $('#file-0a').on('fileuploaded', function (event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
            response = data.response, reader = data.reader;
        var tmplate=
            '<li class="list-group-item" id='+response.fileResourceId+'>' +
            '<span>'+response.fileResourceName+'</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '<button class="btn-danger btn" id="delFileBtn">删除</button>' +
            '</li>';
        $(tmplate).appendTo($('#atachment_list'))
            .data("file",response)
            .find('button').click(function(){
            var fileResource=$(this).parent().data("file");
            $.ajax({
                url: path + '/fileresource/deleteFile',
                method: 'post',
                dataType: "json",
                contentType: 'application/json;charset=UTF-8',
                data: JSON.stringify(fileResource),
                success: function (response) {
                    if (!response.success) {
                        bootbox.alert(response.message);
                    } else {
                        $('#'+fileResource.fileResourceId).remove();
                    }
                },
                error: function (response) {
                    bootbox.alert("error");
                }
            });
        });
    });

    $('#file-0a').on('filebatchuploadcomplete', function(event, files, extra) {
        $("#file-0a").fileinput('reset');
    });


});

window.setTimeout(function () {
    query();
});

var gridoptions = null;
function query() {
    $('#_grid').treegrid({
        // toolbar :"#toolbar",//工具栏
        idField: 'id',
        treeField: 'name',
        rownumbers: true,
        showFooter: true,// 显示底部统计数
        pagination: true,
        fitColumns: true,
        animate: true,
        collapsible: true,
        singleSelect: true,
        deepCascade: true,
        pageSize: '20',
        pageList: [20, 50, 100],
        width: ($(document.body).width()) - $(".app-sidebar-wrapper").width() - 30,// 设置grid宽度
        height: $(document.body).height() - 215,// 设置grid高度
        url: path + '/marathonActivity/queryActivites',
        queryParams: {
            'page': gridoptions == null ? '0' : gridoptions.pageNumber,
            'rows': gridoptions == null ? '20' : gridoptions.pageSize,
            'marathonId': $("#marathon_select").val()
        },
        columns: [[
            {field: 'name', title: '名称', width: 150},
            {field: 'activityDirector', title: '执行者', width: 80, align: 'center'},
            {field: 'activityStatus', title: '活动状态', width: 80, align: 'center'},
            {field: 'activityPlanStarttime', title: '计划开始时间', width: 100, align: 'center'},
            {field: 'activityPlanEndtime', title: '计划结束时间', width: 100, align: 'center'}
        ]],
        onBeforeLoad: function (row, param) {
            App.loading({'show': false});
        },
        onLoadSuccess: function (row, data) {
            gridoptions = $("#_grid").datagrid('getPager').data("pagination").options;
            console.log(gridoptions);
            if (data.length <= 0) {
                sing_msg("没有查询到符合条件的数据！");
            }
        },
        onLoadError: function () {
            console.log("error");
        }
    });
}


function gridBtnUpdate() {
    var activity = $('#_grid').treegrid('getSelected');
    if(!activity.leaf){
        return;
    }

    $('#create-activity-modal').data("activity", activity);

    $('#activity-name-input').val(activity.name);
    $('#activity_startTime').val(activity.activityStarttimeStr);
    $('#activity_endTime').val(activity.activityEndtimeStr);
    $('#activity_director').val(activity.activityDirector);
    $('#cost_budget').val(activity.activityCost);
    $('#activity_profile').val(activity.activityProfile);

    $('#atachment_list').empty();
    $.get(path+"/mediaactivity/queryFileResources?activityId="+activity.id,function(result){
        $.each(result,function(index,fileResource){
            var tmplate=
                '<li class="list-group-item" id='+fileResource.fileResourceId+'>' +
                '<span>'+fileResource.fileResourceName+'</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
                '<button class="btn-danger btn" id="delFileBtn">删除</button>' +
                '</li>';
            $(tmplate).appendTo($('#atachment_list'))
                .data("file",fileResource)
                .find('button').click(function(){
                var fileResource=$(this).parent().data("file");
                $.ajax({
                    url: path + '/fileresource/deleteFile',
                    method: 'post',
                    dataType: "json",
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify(fileResource),
                    success: function (response) {
                        if (!response.success) {
                            bootbox.alert(response.message);
                        } else {
                            $('#'+fileResource.fileResourceId).remove();
                        }
                    },
                    error: function (response) {
                        bootbox.alert("error");
                    }
                });
            });

        });
    });

    $('#modal-title').html("修改活动");
    $('#create-activity-modal').modal("show");
}


function saveActivity() {
        //修改活动
        var activity = $('#create-activity-modal').data("activity");
        var newActivity = {};
        newActivity.activityUuid = activity.activityUuid;
        newActivity.activityName = $.trim($('#activity-name-input').val());
        newActivity.activityStarttimeStr = $.trim($('#activity_startTime').val());
        newActivity.activityEndtimeStr = $.trim($('#activity_endTime').val());
        newActivity.activityDirector = $.trim($('#activity_director').val());
        newActivity.activityCost = $.trim($('#cost_budget').val());
        newActivity.marathonUuid = activity.marathonUuid;
        newActivity.activityClassify = activity.activityClassify;
        newActivity.activityComments = $.trim($('#activity_profile').val())

        $.ajax({
            url: path + '/marathonActivity/update',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(newActivity),
            success: function (response) {
                if (response.status != '000') {
                    bootbox.alert(response.statusDesc);
                } else {
                    bootbox.alert("修改赛事活动成功！", function () {
                        $('#create-activity-modal').modal('hide');
                        $('#_grid').treegrid('reload');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
}