package com.ly.pattern.builder;

/**
 * @author ly
 * @Date: 2022/8/26 14:21
 *
 * 杯子类
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }
}
