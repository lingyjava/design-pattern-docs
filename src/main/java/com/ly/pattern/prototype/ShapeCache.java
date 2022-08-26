package com.ly.pattern.prototype;

import com.ly.pattern.factory.shape.ShapeEnum;

import java.util.Hashtable;

/**
 * @author ly
 * @Date: 2022/8/26 15:47
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String type) {
        if (type != null && !type.isEmpty()) {
            return (Shape) shapeMap.get(type).clone();
        }
        return null;
    }


    public static void loadCache() {
        /*
        * 可以是运行数据库查询等较耗费资源的操作。
        * */
        Circle circle = new Circle();
        circle.setId("10001");
        shapeMap.put(ShapeEnum.CIRCLE.getCode(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("10002");
        shapeMap.put(ShapeEnum.RECTANGLE.getCode(), rectangle);

        Square square = new Square();
        square.setId("10003");
        shapeMap.put(ShapeEnum.SQUARE.getCode(), square);

    }
}
