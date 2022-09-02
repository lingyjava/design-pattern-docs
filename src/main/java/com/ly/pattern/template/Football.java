package com.ly.pattern.template;

/**
 * @author ly
 * @Date: 2022/9/2 10:31
 */
public class Football extends Game{

    @Override
    void initResources() {
        System.out.println("Football loading.......");
    }

    @Override
    void start() {
        System.out.println("Football start play");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        end();
    }

    @Override
    void end() {
        System.out.println("Football end");
    }
}
