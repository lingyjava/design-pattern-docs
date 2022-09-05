package com.ly.pattern.service.locator;

/**
 * @author ly
 * @Date: 2022/9/5 13:49
 */
public class ServiceImpl2 implements Service{
    @Override
    public void execute() {
        System.out.println("serviceImpl2 execute...");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
