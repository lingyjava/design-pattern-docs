package com.ly.pattern.intercepting.filter;

/**
 * @author ly
 * @Date: 2022/9/5 11:53
 */
public interface Filter {

    /**
     * 过滤方法
     * @param request 模拟请求
     * */
    void execute(String request);
}
