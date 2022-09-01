package com.ly.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/1 14:55
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
