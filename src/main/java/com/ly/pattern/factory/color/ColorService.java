package com.ly.pattern.factory.color;

/**
 * @author ly
 * @Date: 2022/8/25 15:22
 */
public class ColorService {

    private static ColorFactory colorFactory = new ColorFactory();

    public static void fill() {
        colorFactory.getColor(ColorEnum.BLUE.getCode()).fill();
        colorFactory.getColor(ColorEnum.RED.getCode()).fill();
        colorFactory.getColor(ColorEnum.GREEN.getCode()).fill();
    }

    public static void main(String[] args) {
        fill();
    }
}
