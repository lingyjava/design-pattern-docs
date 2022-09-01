package com.ly.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ly
 * @Date: 2022/9/1 14:55
 */
public class Subject {

    private ExecutorService threadPool = Executors.newFixedThreadPool(3);

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach((cur) -> threadPool.execute(cur::update));
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void threadPoolShutdown() {
        threadPool.shutdown();
    }
}
