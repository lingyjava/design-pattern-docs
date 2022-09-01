package com.ly.pattern.state;

/**
 * @author ly
 * @Date: 2022/9/1 17:09
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("execute");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
