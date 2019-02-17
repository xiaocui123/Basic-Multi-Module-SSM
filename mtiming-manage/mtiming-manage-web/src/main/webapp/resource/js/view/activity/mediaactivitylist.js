$(function () {
    //修改tab标题
    $('#marathon_title').html(marathonName);

    $('#grid').bootstrapTable({
        url: path + '/mediaactivity/queryByMarathon',         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        toolbar: '#toolbar',                //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sortable: false,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
        queryParams: queryParams,            //传递参数（*）
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: true,
        showColumns: false,                  //是否显示所有的列
        showRefresh: false,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "marathonUuid",             //每一行的唯一标识，一般为主键列
        showToggle: false,                    //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                   //是否显示父子表
        columns: [
            {
                checkbox: true
            },
            {
                field: "mediaActivityUuid", title: "序号", width: 40, align: 'center',
                formatter: function (value, row, index) {
                    return index + 1;
                }
            },
            {field: "mediaActivityName", title: "活动名称", width: 100, valign: 'middle'},
            {field: "mediaActivityStarttimeStr", title: "开始时间", valign: 'middle'},
            {field: "mediaActivityEndtimeStr", title: "结束时间", valign: 'middle'}
        ]
    });

    function queryParams(params) {
        var parameter = {
            limit: params.limit,
            offset: params.offset,
            marathonUuid: marathonUuid,
            activityType: "0"
        };
        return parameter;
    }

    //设置选中背景色
    $('#grid').on('click-row.bs.table',function(e,row,$element){
        $('.success').removeClass('success');
        $($element).addClass('success');
    });

    $('.form_datetime').each(function(){
        var getTimeId = $(this).find("input");
        setTimer = {
            pickerPosition : "bottom-left",
            autoclose : true,
            format : 'yyyy-mm-dd hh:ii',
            pickDate: true,
            pickTime: true,
            hourStep: 1,
            minView : 1,
            minuteStep: 5
        }
        getTimeId.datetimepicker(setTimer);
    });

    $('#activity-add-btn').click(function () {
        createActivity();
    });

    $('#activity-update-btn').click(function () {
        updateActivity();
    });

    $('#activity-delete-btn').click(function(){
        deleteActivity();
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

    $('#saveActivityBtn').click(function(){
        saveActivity();
    });
});

function updateActivity(){
    var activity = $('#grid').bootstrapTable('getSelections');
    if(activity.length !=1){
        bootbox.alert("请选择一个媒体活动！");
        return false;
    }
    $('#create-activity-modal').data("activity",activity[0]);
    $('#activityId').val(activity[0].mediaActivityUuid);

    $('#marathon-name-input').val(activity[0].mediaActivityName);
    $('#activity_startTime').val(activity[0].mediaActivityStarttimeStr);
    $('#activity_endTime').val(activity[0].mediaActivityEndtimeStr);
    $('#activity_director').val(activity[0].mediaActivityDirector);
    $('#cost_budget').val(activity[0].mediaActivityCost);
    $('#activity_status').val(activity[0].mediaActivityStatus);
    $('#activity_progress').val(activity[0].mediaActivityProgress);

    $('#atachment_list').empty();
    $.get(path+"/mediaactivity/queryFileResources?activityId="+activity[0].mediaActivityUuid,function(result){
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

function createActivity(){
    $('#modal-title').html("新建活动");
    $('#create-activity-modal').removeData("activity");

    $('#marathon-name-input').val("");
    $('#activity_startTime').val("");
    $('#activity_endTime').val("");
    $('#activity_director').val("");
    $('#cost_budget').val("");
    $('#activity_status').val("");
    $('#activity_progress').val("");

    $('#atachment_list').empty();

    $('#create-activity-modal').modal("show");
}

function saveActivity(){
    if(!$('#create-activity-modal').data("activity")){
        //新建活动
        var activity={
            marathonUuid:marathonUuid,
            mediaActivityType:"0",
            mediaActivityName: $.trim($('#marathon-name-input').val()),
            mediaActivityStarttimeStr: $.trim($('#activity_startTime').val()),
            mediaActivityEndtimeStr: $.trim($('#activity_endTime').val()),
            mediaActivityDirector: $.trim($('#activity_director').val()),
            mediaActivityCost:$.trim($('#cost_budget').val()),
            mediaActivityStatus: $.trim($('#activity_status').val()),
            mediaActivityProgress: $.trim($('#activity_progress').val())
        }
        activity.lstFileResourceId=[];
        $('#atachment_list .list-group-item').each(function(index,item){
            activity.lstFileResourceId.push($(item).data("file").fileResourceId);
        });

        $.ajax({
            url: path + '/mediaactivity/add',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(activity),
            success: function (response) {
                if (!response.success) {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("添加媒体活动成功！", function () {
                        $('#create-activity-modal').modal('hide');
                        $("#grid").bootstrapTable('refresh');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
    }else{
        //修改活动
        var activity=$('#create-activity-modal').data("activity");
        var newActivity={};
        newActivity.mediaActivityUuid=activity.mediaActivityUuid;
        newActivity.mediaActivityName= $.trim($('#marathon-name-input').val());
        newActivity.mediaActivityStarttimeStr= $.trim($('#activity_startTime').val());
        newActivity.mediaActivityEndtimeStr= $.trim($('#activity_endTime').val());
        newActivity.mediaActivityDirector= $.trim($('#activity_director').val());
        newActivity.mediaActivityCost=$.trim($('#cost_budget').val());
        newActivity.mediaActivityStatus= $.trim($('#activity_status').val());
        newActivity.mediaActivityProgress= $.trim($('#activity_progress').val());
        newActivity.marathonUuid=activity.marathonUuid;
        newActivity.activityType=activity.activityType;
        newActivity.mediaActivityCreator=activity.mediaActivityCreator;
        newActivity.mediaActivityCreatetime=activity.mediaActivityCreatetime;

        $.ajax({
            url: path + '/mediaactivity/update',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(newActivity),
            success: function (response) {
                if (!response.success) {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("修改媒体活动成功！", function () {
                        $('#create-activity-modal').modal('hide');
                        $("#grid").bootstrapTable('refresh');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });

    }
}

function deleteActivity(){
    var selectedActivitys = $('#grid').bootstrapTable('getSelections');
    if(selectedActivitys.length > 0){
        var arrayActivityId=[];
        $.each(selectedActivitys,function(index,activity){
            arrayActivityId.push(activity.mediaActivityUuid);
        });
        $.ajax({
            url: path + '/mediaactivity/delete',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(arrayActivityId),
            success: function (response) {
                if (!response.success) {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("删除媒体活动成功！", function () {
                        $("#grid").bootstrapTable('refresh');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
    }
}
