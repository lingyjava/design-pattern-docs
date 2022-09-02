package com.ly.pattern.business;

/**
 * @author ly
 * @Date: 2022/9/2 14:19
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("JMSService invoking");
    }
}
