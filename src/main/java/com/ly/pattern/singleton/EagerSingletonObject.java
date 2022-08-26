package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 10:54
 *
 * 饿汉单例模式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 */
public class EagerSingletonObject {

    private static EagerSingletonObject instance = new EagerSingletonObject();

    private EagerSingletonObject(){}

    public static EagerSingletonObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("EagerSingletonObject Message");
    }
}
