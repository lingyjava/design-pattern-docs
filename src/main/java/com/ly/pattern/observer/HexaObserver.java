package com.ly.pattern.observer;

/**
 * @author ly
 * @Date: 2022/9/1 15:59
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        switch (subject.getState()) {
            case 1 :
                System.out.println("hexa observer executor");
                break;
            case 0 :
                System.out.println("hexa observer close");
                break;
            default:
                System.out.println("hexa observer exception");
        }
    }
}
