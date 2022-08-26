package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 10:58
 *
 * 双重校验锁单例
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class DoubleCheckLockSingletonObject {

    private volatile static DoubleCheckLockSingletonObject instance;

    private DoubleCheckLockSingletonObject() {}

    public static DoubleCheckLockSingletonObject getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingletonObject.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingletonObject();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("DoubleCheckLockSingletonObject Message");
    }
}
