package com.ly.pattern.observer;

/**
 * @author ly
 * @Date: 2022/9/1 14:45
 *
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。
 *
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 * 如何解决：使用面向对象技术，可以将这种依赖关系弱化。
 * 关键代码：在抽象类里有一个 ArrayList 存放观察者们。
 * 注意事项： 1、JAVA 中已经有了对观察者模式的支持类。
 *          2、避免循环引用。
 *          3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 */
public class ObserverPatternDemo {

    public void updateState() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        subject.setState(1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------state change to 0----");
        subject.setState(0);
        subject.threadPoolShutdown();
    }

    public static void main(String[] args) {
        ObserverPatternDemo demo = new ObserverPatternDemo();
        demo.updateState();
    }
}
