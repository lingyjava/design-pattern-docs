package com.ly.pattern.chain;

/**
 * @author ly
 * @Date: 2022/8/30 15:04
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file logger : " + message);
    }
}
