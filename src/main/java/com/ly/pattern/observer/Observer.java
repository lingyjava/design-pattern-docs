package com.ly.pattern.observer;

/**
 * @author ly
 * @Date: 2022/9/1 14:56
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
