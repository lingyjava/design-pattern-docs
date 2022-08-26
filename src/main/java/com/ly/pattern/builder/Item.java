package com.ly.pattern.builder;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/26 11:46
 *
 * 表示食物条目和食物包装的接口。
 * 菜单类
 */
public interface Item {

    /**名称*/
    String name();
    /**打包*/
    Packing packing();
    /**单价*/
    BigDecimal price();
}
