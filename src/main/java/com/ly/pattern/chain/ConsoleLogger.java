package com.ly.pattern.chain;

/**
 * @author ly
 * @Date: 2022/8/30 15:00
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("console logger: " + message);
    }
}
