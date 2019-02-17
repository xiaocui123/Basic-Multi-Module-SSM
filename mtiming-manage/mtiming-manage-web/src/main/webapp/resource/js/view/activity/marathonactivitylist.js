$(function () {
    //修改tab标题
    $('#marathon_title').html(marathonName);

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

    $('#saveActivityBtn').click(function () {
        saveActivity();
    });

    $('#_grid').treegrid({
        onDblClickRow: function(row){
            console.log(row);
            var url=path + '/volunteer/init/d2880653-cd8b-405b-bcc9-28cccb1008b6';
            $('#proscenium-box').load(url);
        }
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
            'marathonId': marathonUuid
        },
        toolbar: [
            {
                text: '新建活动',
                iconCls: 'icon-add',
                handler: function () {
                    var selectedClassify = $('#_grid').treegrid('getSelected');
                    if (selectedClassify && !selectedClassify.leaf) {
                        createActivity();
                    } else {
                        bootbox.alert("请选择一个业务类别！");
                    }

                }
            },
        ],
        columns: [[
            {field: 'name', title: '名称', width: 150},
            {field: 'activityDirector', title: '执行者', width: 80, align: 'center'},
            {field: 'activityStatus', title: '活动状态', width: 80, align: 'center'},
            {field: 'activityPlanStarttime', title: '计划开始时间', width: 100, align: 'center'},
            {field: 'activityPlanEndtime', title: '计划结束时间', width: 100, align: 'center'},
            {
                field: 'operate', title: '操作', width: 120, align: 'center',
                formatter: function (value, row, index) {
                    if (!row.leaf) {
                        return "";
                    }
                    if (row.activityStatus == '0') {
                        var gridBtnUpdate = '<input type="button" value="修改" onclick="gridBtnUpdate(\'' + row.id + '\')"  class="btn btn-primary btn-xs">';
                        var gridBtnDel = '<input type="button" value="删除" onclick="gridBtnDel(\'' + row.id + '\')"  class="btn btn-danger btn-xs">';
                        return gridBtnUpdate + '&nbsp;' + gridBtnDel;
                    } else {
                        var gridBtnDetail = '<input type="button" value="查看" onclick="gridBtnDetail(\'' + row.id + '\')"  class="btn btn-primary btn-xs">';
                        return gridBtnDetail;
                    }

                }
            }
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


function gridBtnUpdate(activityId) {
    var activity = $('#_grid').treegrid('find', activityId);
    console.log(activity);

    $('#create-activity-modal').data("activity", activity);

    $('#activity-name-input').val(activity.name);
    $('#activity_startTime').val(activity.activityStarttime);
    $('#activity_endTime').val(activity.activityEndtime);
    $('#activity_director').val(activity.activityDirector);
    $('#cost_budget').val(activity.activityCost);
    $('#activity_profile').val(activity.activityProfile);

    $('#modal-title').html("修改活动");
    $('#create-activity-modal').modal("show");
}

function createActivity() {
    $('#modal-title').html("新建活动");
    $('#create-activity-modal').removeData("activity");

    $('#activity-name-input').val("");
    $('#activity_startTime').val("");
    $('#activity_endTime').val("");
    $('#activity_director').val("");
    $('#cost_budget').val("");
    $('#activity_profile').val("");

    $('#create-activity-modal').modal("show");
}

function saveActivity() {
    if (!$('#create-activity-modal').data("activity")) {
        //新建活动
        var selectedClassify = $('#_grid').treegrid('getSelected');
        var activityClassify = selectedClassify.id;
        var activity = {
            marathonUuid: marathonUuid,
            activityClassify: activityClassify,
            activityName: $.trim($('#activity-name-input').val()),
            activityPlanStarttimeStr: $.trim($('#activity_startTime').val()),
            activityPlanEndtimeStr: $.trim($('#activity_endTime').val()),
            activityDirector: $.trim($('#activity_director').val()),
            activityCost: $.trim($('#cost_budget').val()),
            activityComments: $.trim($('#activity_profile').val())
        }

        $.ajax({
            url: path + '/marathonActivity/add',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(activity),
            success: function (response) {
                if (response.status != '000') {
                    bootbox.alert(response.statusDesc);
                } else {
                    bootbox.alert("添加赛事活动成功！", function () {
                        $('#create-activity-modal').modal('hide');
                        $('#_grid').treegrid('reload');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
    } else {
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
}

function gridBtnDel(activityId) {
    $.get(path + 'marathonActivity/delete/' + activityId, function (data) {
        if (data.status != '000') {
            bootbox.alert(response.message);
        } else {
            bootbox.alert("删除赛事活动成功！", function () {
                $('#_grid').treegrid('reload');
            });
        }
    });
}

function gridBtnDetail(activityId){
    //TODO
}
