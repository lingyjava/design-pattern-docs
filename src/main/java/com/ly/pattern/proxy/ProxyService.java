package com.ly.pattern.proxy;

/**
 * @author ly
 * @Date: 2022/8/30 14:14
 *
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 *
 * 想在访问一个类时做一些控制,增加中间层,实现与被代理类组合。
 */
public class ProxyService {

    public static void main(String[] args) {
        String fileName = "test.jpg";
        Image proxyImage = new ProxyImage(fileName);
        // 仅第一次需要加载
        proxyImage.display();
        proxyImage.display();
        proxyImage.display();
    }

}
