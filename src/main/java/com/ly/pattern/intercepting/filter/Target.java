package com.ly.pattern.intercepting.filter;

/**
 * @author ly
 * @Date: 2022/9/5 11:58
 *
 * 实际执行方法
 */
public class Target implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("request execute");
    }
}
