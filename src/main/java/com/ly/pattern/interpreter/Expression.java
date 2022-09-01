package com.ly.pattern.interpreter;

/**
 * @author ly
 * @Date: 2022/9/1 8:57
 *
 * 解释接口
 */
public interface Expression {

    /**
     * 解释
     * @param content 待解释文本
     * @return yes and no
     * */
    boolean interpreter(String content);
}
