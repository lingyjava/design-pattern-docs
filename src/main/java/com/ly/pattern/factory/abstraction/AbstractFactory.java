package com.ly.pattern.factory.abstraction;

import com.ly.pattern.factory.color.Color;
import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/25 15:24
 *
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
