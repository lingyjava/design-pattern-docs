package com.ly.pattern.command;

/**
 * @author ly
 * @Date: 2022/8/30 16:45
 */
public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
