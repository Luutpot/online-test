package com.zj.onlinetest.enums;

/**
 * @Auther: zj
 * @Date: 2019/4/17 14:29
 * @Description:
 */
public enum  CommonEnum {

    HTTPUSRL(0001,"http://localhost:8080/goingWrittenTest"),

    FALSE(-1,"false"),
    USERNAMEORPASSWORD_ERROR(-2,"用户名或密码错误"),
    PERRMISSIONERROR(-3,"权限不足"),
    PARAMERSERROR(-4,"参数校验不通过"),


    SUCCESS(1,"true"),
    LOGINSUCCEES(2,"管理员登录成功"),
    ADDQUESTIONSUCCESS(3,"增加题库成功"),
    ADDNEWUSERSUCCESS(4,"新增笔试者成功"),
    PUBLISHWRITTENTESTSUCCESS(5,"发布笔试成功"),
    GETUSEALLSUCCESS(6,"获取用户列表成功"),
    GETUSEALLTOTALSUCCESS(7,"获取所有用户数量成功"),
    ;


    private Integer code;
    private String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}