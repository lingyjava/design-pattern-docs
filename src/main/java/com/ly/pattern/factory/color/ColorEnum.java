package com.ly.pattern.factory.color;

/**
 * @author ly
 * @Date: 2022/8/25 15:19
 */
public enum ColorEnum {

    /**矩形*/
    BLUE("BLUE", "蓝色"),
    /**圆形*/
    GREEN("GREEN", "绿色"),
    /**正方形*/
    RED("RED", "红色"),
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

    ColorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
