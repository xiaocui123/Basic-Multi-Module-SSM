package com.mtiming.manage.vo;

import java.io.Serializable;

public class BaseResultBean implements Serializable {

    private static final long serialVersionUID = -2899752944266497051L;

    private String status;
    private String statusDesc;
    private String request;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }


    public BaseResultBean() {
        setEnum(ResultEnum.SUCCESS);
    }

    // 设置枚举
    public BaseResultBean setEnum(ResultEnum item) {
        this.status = item.getStatus();
        this.statusDesc = item.getStatusDesc();
        return this;
    }

    public String getRequest() {
        return request;

    }

    public void setRequest(String request) {
        this.request = request;

    }
}
