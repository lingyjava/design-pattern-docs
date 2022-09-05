package com.ly.pattern.intercepting.filter;

/**
 * @author ly
 * @Date: 2022/9/5 11:56
 */
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        // 打印日志处理
        // ...
        System.out.println("DebugLog...");
    }
}
