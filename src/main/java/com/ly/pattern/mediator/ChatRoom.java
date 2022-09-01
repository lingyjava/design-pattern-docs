package com.ly.pattern.mediator;

import com.ly.pattern.adapter.MediaAdapter;

/**
 * @author ly
 * @Date: 2022/9/1 11:24
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println("From " + user.getName() + " : " + message);
    }
}
