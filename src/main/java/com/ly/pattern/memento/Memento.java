package com.ly.pattern.memento;

/**
 * @author ly
 * @Date: 2022/9/1 14:09
 */
public class Memento {
    /**备份对象*/
    private final String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
