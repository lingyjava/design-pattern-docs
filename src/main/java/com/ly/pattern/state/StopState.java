package com.ly.pattern.state;

/**
 * @author ly
 * @Date: 2022/9/1 17:25
 */
public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("close");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
