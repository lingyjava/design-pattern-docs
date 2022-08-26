package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 14:31
 *
 * 蔬菜汉堡包
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("25.0");
    }
}
