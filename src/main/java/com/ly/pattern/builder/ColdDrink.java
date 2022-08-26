package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 14:24
 *
 * 冷饮类
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
