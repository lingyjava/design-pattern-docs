package com.ly.pattern.front.controller;

/**
 * @author ly
 * @Date: 2022/9/5 11:21
 *
 * 调度类
 */
public class Dispatcher {

    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (homeView.getClass().getSimpleName().equalsIgnoreCase(request)) {
            homeView.show();
        }
        else if (studentView.getClass().getSimpleName().equalsIgnoreCase(request)) {
            studentView.show();
        }
        else {
            System.out.println("NOT FOUND");
        }
    }
}
