package com.ly.pattern.mediator;

/**
 * @author ly
 * @Date: 2022/9/1 11:22
 *
 *
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 * 对象 Colleague 之间的通信封装到一个类中单独处理。
 * 应用实例： 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
 *          2、机场调度系统。
 *          3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
 */
public class MediatorService {

    public static void main(String[] args) {
        User user = new User("ly");
        user.sendMessage("hello");
    }
}
