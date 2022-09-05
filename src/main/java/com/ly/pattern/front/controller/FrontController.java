package com.ly.pattern.front.controller;

/**
 * @author ly
 * @Date: 2022/9/5 11:27
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        // 身份认证
        // ...
        return true;
    }

    private void trackRequest(String request) {
        // 跟踪请求
        // 记录日志
        // ...
        System.out.println("request = " + request);
    }

    public void dispatchRequest(String request) {
        // 接收请求
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
