package com.ly.pattern.prototype;

import com.ly.pattern.factory.shape.ShapeEnum;

/**
 * @author ly
 * @Date: 2022/8/26 15:55
 *
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。
 */
public class PrototypeService {

    public static Shape getShape(String type) {
        ShapeCache.loadCache();
        return ShapeCache.getShape(type);
    }

    public static void main(String[] args) {
        getShape(ShapeEnum.CIRCLE.getCode()).draw();
        getShape(ShapeEnum.RECTANGLE.getCode()).draw();
        getShape(ShapeEnum.SQUARE.getCode()).draw();
    }
}
