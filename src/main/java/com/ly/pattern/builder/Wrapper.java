package com.ly.pattern.builder;

/**
 * @author ly
 * @Date: 2022/8/26 11:49
 *
 * 包装纸类
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }

}
