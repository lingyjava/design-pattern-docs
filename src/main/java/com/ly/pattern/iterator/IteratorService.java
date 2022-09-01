package com.ly.pattern.iterator;

/**
 * @author ly
 * @Date: 2022/9/1 11:05
 *
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 迭代器模式属于行为型模式。
 *
 * 定义接口：hasNext, next。
 * 应用实例：JAVA 中的 iterator。
 */
public class IteratorService {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator nameIterator = nameRepository.getNameIterator();
        while (nameIterator.hasNext()) {
            System.out.println("Name : " + nameIterator.next());
        }
        System.out.println("++++++++");
        for(Iterator iter = nameRepository.getNameIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
