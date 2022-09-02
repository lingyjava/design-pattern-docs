package com.ly.pattern.strategy;

/**
 * @author ly
 * @Date: 2022/9/2 9:59
 *
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * 何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。
 * 如何解决：将这些算法封装成一个一个的类，任意地替换。
 * 关键代码：实现同一个接口。
 *
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("addContext.executeStrategy(10, 5) = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("subContext.executeStrategy(10, 5) = " + context.executeStrategy(10, 5));

    }
}
