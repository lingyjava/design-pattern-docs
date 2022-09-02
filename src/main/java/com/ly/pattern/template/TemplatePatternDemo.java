package com.ly.pattern.template;

/**
 * @author ly
 * @Date: 2022/9/2 10:12
 *
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 *
 * 主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
 * 何时使用：有一些通用的方法。
 * 关键代码：在抽象类实现，其他步骤在子类实现。
 * 优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println();
        Game football = new Football();
        football.play();
    }
}
