package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 14:34
 *
 * 可口可乐
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("30.0");
    }
}
