package com.ly.pattern.entity.composite;

/**
 * @author ly
 * @Date: 2022/9/2 14:38
 *
 * 组合实体模式（Composite Entity Pattern）用在 EJB 持久化机制中。
 * 一个组合实体是一个 EJB 实体 bean，代表了对象的图解。当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的。
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("State", "OK");
        client.printData();

        client.setData("State", "ERROR");
        client.printData();
    }

}
