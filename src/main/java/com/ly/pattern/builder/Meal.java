package com.ly.pattern.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/8/26 14:37
 *
 * 点菜单
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        if (items == null || items.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal cost = BigDecimal.ZERO;
        for (Item cur : items) {
            cost = cost.add(cur.price());
        }
        return cost;
    }

    public void showItems() {
        if (items != null && !items.isEmpty()) {
            for (Item cur : items) {
                System.out.println("Item : " + cur.name() + ",");
                System.out.println("Packing : " + cur.packing().pack() + ",");
                System.out.println("Price : " + cur.price());
            }
        }
    }

}
