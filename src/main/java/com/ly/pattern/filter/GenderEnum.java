package com.ly.pattern.filter;

/**
 * @author lingy
 */

public enum GenderEnum {
    /**男性*/
    MALE("male", "男性"),
    FEMALE("female", "女性"),
    ;

    private final String code;
    /**意义*/
    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    GenderEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
