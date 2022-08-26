package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 14:23
 *
 * 汉堡包类
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();
}
