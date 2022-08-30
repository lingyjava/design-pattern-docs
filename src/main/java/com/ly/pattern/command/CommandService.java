package com.ly.pattern.command;

/**
 * @author ly
 * @Date: 2022/8/30 16:29
 *
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 通过调用者调用接受者执行命令，顺序：调用者→命令→接受者。
 * 定义三个角色：1、received 真正的命令执行对象 2、Command 3、invoker 使用命令对象的入口.
 */
public class CommandService {

    private static Stock stock;

    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock()));
        broker.takeOrder(new SellStock(new Stock()));
        broker.placeOrders();
    }
}
