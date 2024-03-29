package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 11:25
 *
 * 登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */
public class RegisteredSingletonObject {

    private static class SingletonHolder {
        private static final RegisteredSingletonObject INSTANCE = new RegisteredSingletonObject();
    }

    private RegisteredSingletonObject() {}

    public static RegisteredSingletonObject getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("RegisteredSingletonObject Message");
    }
}
