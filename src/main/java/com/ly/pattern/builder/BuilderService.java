package com.ly.pattern.builder;

/**
 * @author ly
 * @Date: 2022/8/26 11:42
 *
 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 * 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 */
public class BuilderService {

    public static void order() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("total cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("total cost : " + nonVegMeal.getCost());
    }

    public static void main(String[] args) {
        order();
    }
}
