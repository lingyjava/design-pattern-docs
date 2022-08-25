package com.ly.pattern.factory.shape;

/**
 * @author ly
 * @Date: 2022/8/25 14:58
 */
public enum ShapeEnum {
    /**矩形*/
    RECTANGLE("RECTANGLE", "矩形"),
    /**圆形*/
    CIRCLE("CIRCLE", "圆形"),
    /**正方形*/
    SQUARE("SQUARE", "正方形"),
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

    ShapeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
