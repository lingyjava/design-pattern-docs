package com.ly.pattern.state;

/**
 * @author ly
 * @Date: 2022/9/1 17:08
 */
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
