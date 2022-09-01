package com.ly.pattern.observer;

/**
 * @author ly
 * @Date: 2022/9/1 15:56
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        switch (subject.getState()) {
            case 1 :
                System.out.println("octal observer executor");
                break;
            case 0 :
                System.out.println("octal observer close");
                break;
            default:
                System.out.println("octal observer exception");
        }
    }
}
