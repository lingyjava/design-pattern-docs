package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 10:48
 *
 * 懒汉单例模式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 *
 */
public class LazySingletonObject {

    private static LazySingletonObject instance;

    private LazySingletonObject() {}

    public static LazySingletonObject getInstance() {
        if (instance == null) {
            instance = new LazySingletonObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("LazySingletonObject Message");
    }
}
