package com.ly.pattern.factory.abstraction;

import com.ly.pattern.factory.color.ColorFactory;
import com.ly.pattern.factory.shape.ShapeFactory;

/**
 * @author ly
 * @Date: 2022/8/25 15:28
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factoryType) {
        if (factoryType == null || factoryType.isEmpty()) {
            return null;
        }
        if (FactoryEnum.COLOR.getCode().equals(factoryType)) {
            return new ColorFactory();
        }
        if (FactoryEnum.SHAPE.getCode().equals(factoryType)) {
            return new ShapeFactory();
        }
        return null;
    }
}
