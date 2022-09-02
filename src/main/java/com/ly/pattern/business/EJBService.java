package com.ly.pattern.business;

/**
 * @author ly
 * @Date: 2022/9/2 14:18
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("EJBService invoking");
    }
}
