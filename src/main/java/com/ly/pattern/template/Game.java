package com.ly.pattern.template;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ly
 * @Date: 2022/9/2 10:14
 */
public abstract class Game {

    private HashSet<String> role;

    abstract void initResources();

    boolean login() {

        return true;
    }

    abstract void start();

    abstract void end();

    final void play() {
        if (login()) {
            System.out.println("user login success");
        } else {
            System.out.println("user login fail");
            return;
        }

        initResources();
        start();
    }

}
