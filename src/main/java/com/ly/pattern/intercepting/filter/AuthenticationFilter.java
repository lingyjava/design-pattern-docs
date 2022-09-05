package com.ly.pattern.intercepting.filter;

/**
 * @author ly
 * @Date: 2022/9/5 11:53
 */
public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        // 身份认证处理
        // ...
        System.out.println("Authentication success");
        // 认证失败,return;
    }
}
