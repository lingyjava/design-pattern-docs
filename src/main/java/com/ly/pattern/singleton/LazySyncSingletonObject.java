package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 10:51
 *
 * 懒汉式线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class LazySyncSingletonObject {

    private static LazySyncSingletonObject instance;

    private LazySyncSingletonObject() {}

    public static synchronized LazySyncSingletonObject getInstance() {
        if (instance == null) {
            instance = new LazySyncSingletonObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("LazySyncSingletonObject Message");
    }
}
