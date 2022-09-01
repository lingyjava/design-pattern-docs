package com.ly.pattern.observer;

/**
 * @author ly
 * @Date: 2022/9/1 15:49
 *
 * 一个观察者
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        switch (subject.getState()) {
            case 1 :
                System.out.println("binary observer executor");
                break;
            case 0 :
                System.out.println("binary observer close");
                break;
            default:
                System.out.println("binary observer exception");
        }
    }
}
