package com.ly.pattern.factory.color;

import com.ly.pattern.factory.abstraction.AbstractFactory;
import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/25 15:19
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null || colorType.isEmpty()) {
            return null;
        }
        if (ColorEnum.BLUE.getCode().equals(colorType)) {
            return new Blue();
        }
        if (ColorEnum.GREEN.getCode().equals(colorType)) {
            return new Green();
        }
        if (ColorEnum.RED.getCode().equals(colorType)) {
            return new Red();
        }
        return null;
    }

}
