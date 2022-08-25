package com.ly.pattern.factory.abstraction;

import com.ly.pattern.factory.color.ColorEnum;
import com.ly.pattern.factory.color.ColorFactory;
import com.ly.pattern.factory.shape.ShapeEnum;

/**
 * @author ly
 * @Date: 2022/8/25 15:32
 */
public class AbstractFactoryService {

    private static final FactoryProducer FACTORY_PRODUCER = new FactoryProducer();

    public static void fill() {
        AbstractFactory colorFactory = FACTORY_PRODUCER.getFactory(FactoryEnum.COLOR.getCode());
        colorFactory.getColor(ColorEnum.GREEN.getCode()).fill();
        colorFactory.getColor(ColorEnum.RED.getCode()).fill();
        colorFactory.getColor(ColorEnum.BLUE.getCode()).fill();
    }

    public static void draw() {
        AbstractFactory shapeFactory = FACTORY_PRODUCER.getFactory(FactoryEnum.SHAPE.getCode());
        shapeFactory.getShape(ShapeEnum.CIRCLE.getCode()).draw();
        shapeFactory.getShape(ShapeEnum.SQUARE.getCode()).draw();
        shapeFactory.getShape(ShapeEnum.RECTANGLE.getCode()).draw();
    }

    public static void main(String[] args) {
        fill();
        draw();
    }

}
