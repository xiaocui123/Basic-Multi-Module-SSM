package com.mtiming.manage.vo;

public enum ResultEnum {
    //通用错误码
    SUCCESS("000", "成功"),ERROR("001","系统异常");

    // 成员变量  
    private String status;
    private String statusDesc;


    ResultEnum(String code, String desc) {
        this.status = code;
        this.statusDesc = desc;
    }

    //覆盖方法
    @Override
    public String toString() {
        return this.status + "_" + this.statusDesc;
    }

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

}
