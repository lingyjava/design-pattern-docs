package com.ly.pattern.business;

/**
 * @author ly
 * @Date: 2022/9/2 14:15
 *
 * 业务代表模式（Business Delegate Pattern）用于对表示层和业务层解耦。
 * 它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。在业务层中我们有以下实体。
 */
public class BusinessPatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType(EJBService.class.getSimpleName());
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(JMSService.class.getSimpleName());
        client.doTask();
    }
}