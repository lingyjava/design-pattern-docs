package com.ly.pattern.flyweight;

import com.ly.pattern.factory.color.ColorEnum;
import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/30 11:43
 */
public class FlyweightService {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleRed = shapeFactory.getCircle(ColorEnum.RED.getCode());
        Shape circleRedToo = shapeFactory.getCircle(ColorEnum.RED.getCode());
        circleRed.draw();
        circleRedToo.draw();
        System.out.println(circleRed.toString());
        System.out.println(circleRedToo.toString());
    }
}
