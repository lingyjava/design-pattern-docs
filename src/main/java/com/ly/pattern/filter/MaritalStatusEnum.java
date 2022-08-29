package com.ly.pattern.filter;

/**
 * @author lingy
 */

public enum MaritalStatusEnum {
    /**单身*/
    SINGLE("single", "单身"),

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

    MaritalStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
