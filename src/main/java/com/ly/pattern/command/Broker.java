package com.ly.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/8/30 16:49
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.forEach(Order::execute);
        orders.clear();
    }
}
