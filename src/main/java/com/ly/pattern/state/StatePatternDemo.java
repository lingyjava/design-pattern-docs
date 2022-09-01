package com.ly.pattern.state;

/**
 * @author ly
 * @Date: 2022/9/1 17:06
 *
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 *
 * 关键代码：通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。
 * 而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。
 * 也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。
 * 状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 *
 * 应用实例： 1、打篮球的时候运动员可以有正常状态、不正常状态和超常状态。
 *          2、曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
 *
 * 使用场景： 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 * 注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
