$(function () {
    $('#grid').bootstrapTable({
        url: path + '/marathon/query',         //请求后台的URL（*）
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
        singleSelect: true,
        clickToSelect:true,
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
                field: "marathonUuid", title: "序号", width: 40, align: 'center',
                formatter: function (value, row, index) {
                    return index + 1;
                }
            },
            {field: "marathonName", title: "赛事名称", width: 100, valign: 'middle'},
            {field: "marathonStarttimeStr", title: "开始时间", valign: 'middle'},
            {field: "marathonEndtimeStr", title: "结束时间", valign: 'middle'},
            {field: "marathonCreater", title: "创建人", valign: 'middle'},
            {field: "marathonCreatetimeStr", title: "创建时间", valign: 'middle'}
        ]
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

    function queryParams(params) {
        var parameter = {
            limit: params.limit,
            offset: params.offset
        };
        return parameter;
    }

    //设置选中背景色
    $('#grid').on('click-row.bs.table',function(e,row,$element){
        $('.success').removeClass('success');
        $($element).addClass('success');
    });

    $('#marathon-add-btn').click(function () {
        gridBtnAdd();
    });


    $('#marathon-update-btn').click(function () {
        updateMarathon();
    });

    $('#marathon-delete-btn').click(function(){
        deleteMarathon();
    });


    $('#saveMarathonBtn').click(function () {
        saveMarathon();
    });

    //初始化业务项字典checkbox
    (function () {
        var lstParentId = ["250"];
        $.ajax({
            url: path + '/dict/getDict',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(lstParentId),
            success: function (data) {
                //先删除
                var div=$(".hzp161018_box:first").parent();
                $(".hzp161018_box").remove();

                $.each(data, function (index, dict) {
                    $(div).append(
                        '<div class="hzp161018_box">' +
                            '<span class="hzp161018_tdbox">' +
                                '<input type="checkbox" name="coSponsors" value='+dict.id+' >' +
                            '</span>' + dict.val+
                        '</div>');
                });
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
    }());

    $('#grid').on("dbl-click-row.bs.table",function(row,element,field){
        console.log(element.marathonUuid);
        var url=path + '/marathonActivity/activitylist/init//'+element.marathonUuid;
        $('#proscenium-box').load(url);
    });
})

function gridBtnAdd() {
    $('#modal-title').html("新建赛事");
    $('#marathon-name-input').val("");
    $('#marathon-address-input').val("");
    $("#marathon_startTime").val("");
    $("#marathon_endTime").val("");
    $("#marathon_comment").val("");
    $(":checkbox").attr("checked", false);
    $('#create-marathon-modal').modal('show');
}

function updateMarathon(){

    var lstMarathon = $('#grid').bootstrapTable('getSelections');
    if(lstMarathon.length !=1){
        bootbox.alert("请选择一个赛事！");
        return false;
    }
    $('#create-marathon-modal').data("marathon",lstMarathon[0]);

    var marathon=lstMarathon[0];
    $("#marathon-name-input").val(marathon.marathonName);
    $("#marathon_startTime").val(marathon.marathonStarttimeStr);
    $("#marathon_endTime").val(marathon.marathonEndtimeStr);
    $("#marathon-address-input").val(marathon.marathonAddress);
    $("#marathon_comment").val(marathon.marathonComment);

    $.get(path+"/marathon/activityclassify/"+marathon.marathonUuid,function(result){
        $(":checkbox").attr("checked", false);
        $.each(result,function(index,classify){
            $("[value="+classify+"]:checkbox").prop("checked",true);
        });

        $('#modal-title').html("修改赛事");
        $('#create-marathon-modal').modal("show");

    });
}

function deleteMarathon(){
    var selectedMarathons = $('#grid').bootstrapTable('getSelections');
    console.log(selectedMarathonIds);
    if(selectedMarathons.length > 0){
        var selectedMarathonIds=[];
        $.each(selectedMarathons,function(index,marathon){
            selectedMarathonIds.push(marathon.marathonUuid);
        });
        $.ajax({
            url: path + '/marathon/delete',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(selectedMarathonIds),
            success: function (response) {
                if (response.status!="000") {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("删除赛事成功！", function () {
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

function saveMarathon(){
    var marathon={};
    var oldMarathon=$("#create-marathon-modal").data("marathon");
    if(!oldMarathon){
        marathon.marathonName=$.trim($("#marathon-name-input").val());
        marathon.marathonStarttimeStr= $.trim($("#marathon_startTime").val());
        marathon.marathonEndtimeStr=$.trim($("#marathon_endTime").val());
        marathon.marathonAddress=$.trim($("#marathon-address-input").val());
        marathon.marathonComment= $.trim($("#marathon_comment").val());
        marathon.lstMarathonClassify=[];
        var checkbox=$("input[type='checkbox']");
        $.each(checkbox,function(index,item){
            if(item.checked){
                marathon.lstMarathonClassify.push(item.value);
            }
        });
        $.ajax({
            url: path + '/marathon/add',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(marathon),
            success: function (response) {
                if (response.status!="000") {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("添加赛事成功！", function () {
                        $('#create-marathon-modal').modal('hide');
                        $("#grid").bootstrapTable('refresh');
                    });
                }
            },
            error: function (response) {
                bootbox.alert("error");
            }
        });
    }else{
        marathon.marathonUuid=oldMarathon.marathonUuid;
        marathon.marathonName=$.trim($("#marathon-name-input").val());
        marathon.marathonStarttimeStr= $.trim($("#marathon_startTime").val());
        marathon.marathonEndtimeStr=$.trim($("#marathon_endTime").val());
        marathon.marathonAddress=$.trim($("#marathon-address-input").val());
        marathon.marathonComment= $.trim($("#marathon_comment").val());
        marathon.lstMarathonClassify=[];
        var checkbox=$("input[type='checkbox']");
        $.each(checkbox,function(index,item){
            if(item.checked){
                marathon.lstMarathonClassify.push(item.value);
            }
        });
        $.ajax({
            url: path + '/marathon/update',
            method: 'post',
            dataType: "json",
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify(marathon),
            success: function (response) {
                if (response.status!="000") {
                    bootbox.alert(response.message);
                } else {
                    bootbox.alert("修改赛事成功！", function () {
                        $('#create-marathon-modal').modal('hide');
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