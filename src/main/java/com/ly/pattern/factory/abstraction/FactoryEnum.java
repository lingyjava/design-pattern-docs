package com.ly.pattern.factory.abstraction;

/**
 * @author ly
 * @Date: 2022/8/25 15:28
 */
public enum FactoryEnum {

    /**颜色*/
    COLOR("COLOR", "颜色"),
    /**形状*/
    SHAPE("SHAPE", "形状"),
    ;

    /**编码*/
    private final String code;
    /**意义*/
    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    FactoryEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
