package com.ly.pattern.memento;

/**
 * @author ly
 * @Date: 2022/9/1 14:07
 *
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * 如何解决：通过一个备忘录类专门存储对象状态。
 * 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
 * 应用实例： 1、后悔药。
 *          2、打游戏时的存档。
 *          3、Windows 里的 ctrl + z。
 *          4、IE 中的后退。
 *          5、数据库的事务管理。
 */
public class MementoService {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("state v1");
        originator.setState("state v2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state v3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state v4");

        System.out.println("Current state : " + originator.getState());
        System.out.println("First save state : " + careTaker.get(0).getState());
        System.out.println("Second save state : " + careTaker.get(1).getState());
    }
}
