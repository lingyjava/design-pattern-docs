package com.ly.pattern.flyweight;

import com.ly.pattern.factory.shape.Shape;

import java.util.HashMap;

/**
 * @author ly
 * @Date: 2022/8/30 11:36
 *
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 *
 * 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。用 HashMap 存储这些对象。
 *
 * 1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 2、数据库的数据池。
 */
public class ShapeFactory {

    private HashMap<String, Shape> circleMap = new HashMap<>();

    public Shape getCircle(String color) {
        if (circleMap.get(color) == null) {
            circleMap.put(color, new Circle(color));
        }
        return circleMap.get(color);
    }
}
