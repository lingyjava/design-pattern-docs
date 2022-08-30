package com.ly.pattern.facade;

/**
 * @author ly
 * @Date: 2022/8/30 11:27
 *
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 *
 * 在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好。
 */
public class FacadeService {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.draw();
    }
}
