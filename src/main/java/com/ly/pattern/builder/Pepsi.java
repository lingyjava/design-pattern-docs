package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 14:35
 *
 * 百事可乐
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("35.0");
    }
}
