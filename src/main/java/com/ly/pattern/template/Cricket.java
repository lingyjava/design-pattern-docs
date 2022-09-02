package com.ly.pattern.template;

/**
 * @author ly
 * @Date: 2022/9/2 10:28
 */
public class Cricket extends Game{
    @Override
    void initResources() {
        System.out.println("Cricket loading.......");
    }

    @Override
    void start() {
        System.out.println("Cricket start play");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        end();
    }

    @Override
    void end() {
        System.out.println("Cricket end");
    }
}
