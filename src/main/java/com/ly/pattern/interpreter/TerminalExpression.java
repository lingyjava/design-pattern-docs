package com.ly.pattern.interpreter;

/**
 * @author ly
 * @Date: 2022/9/1 9:00
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String content) {
        if (content.contains(data)) {
            return true;
        }
        return false;
    }
}
