package com.example.dtuandclient.entity.ErrCode;

public enum  ResultEnum {
    UNKNOWM_ERROR(-100,"未知错误"),
        NEED_LOGIN(-1, "未登录"),
    USER_NOT_EXIST(-2,"丢，你搞鸡儿呢"),
    PASSWORD_ERROR(-3,"丢雷楼某"),
    EMPTY_USERNAME(-4,"用户名为空"),
    EMPTY_PASSWORD(-5,"密码为空"),
    SUCCESS(0,"好嗨哟，感觉到人生达了巅峰"),
    SYSTEM_ERROR(-999999,"服务器挂了，搞个鸡儿");
    private Integer code;
    private String msg;
    private ResultEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
