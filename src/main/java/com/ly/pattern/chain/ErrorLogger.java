package com.ly.pattern.chain;

/**
 * @author ly
 * @Date: 2022/8/30 15:03
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error logger : " + message);
    }
}
