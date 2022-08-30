package com.ly.pattern.command;

/**
 * @author ly
 * @Date: 2022/8/30 16:46
 */
public class Stock {

    private String name = "cmd";
    private int quantity = 1;

    public void buy() {
        System.out.println("buy," + "name:" + name + "quantity:" + quantity);
    }

    public void sell() {
        System.out.println("sell," + "name:" + name + "quantity:" + quantity);
    }
}
