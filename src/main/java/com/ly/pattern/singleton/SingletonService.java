package com.ly.pattern.singleton;

/**
 * @author ly
 * @Date: 2022/8/26 10:42
 */
public class SingletonService {

    public static void getSingletonObject() {
        // 一般情况下，不建议使用第 1 种和第 2 种懒汉方式。
        LazySingletonObject.getInstance().showMessage();
        LazySyncSingletonObject.getInstance().showMessage();
        // 建议使用第 3 种饿汉方式。
        EagerSingletonObject.getInstance().showMessage();
        // 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
        DoubleCheckLockSingletonObject.getInstance().showMessage();
        // 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
        RegisteredSingletonObject.getInstance().showMessage();
        // 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
        EnumSingletonObject.INSTANCE.showMessage();
    }

    public static void main(String[] args) {
        getSingletonObject();
    }
}
