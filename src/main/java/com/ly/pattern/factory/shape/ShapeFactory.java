package com.ly.pattern.factory.shape;

import com.ly.pattern.factory.abstraction.AbstractFactory;
import com.ly.pattern.factory.color.Color;

/**
 * @author ly
 * @Date: 2022/8/25 14:57
 *
 * 注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 *          有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。
 *          如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }
        if (ShapeEnum.RECTANGLE.getCode().equals(shapeType)) {
            return new Rectangle();
        }
        if (ShapeEnum.CIRCLE.getCode().equals(shapeType)) {
            return new Circle();
        }
        if (ShapeEnum.SQUARE.getCode().equals(shapeType)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
