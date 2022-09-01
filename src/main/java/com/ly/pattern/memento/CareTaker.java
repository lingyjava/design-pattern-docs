package com.ly.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/1 14:34
 *
 * 临时管理
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
