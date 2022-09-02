package com.ly.pattern.visitor;

/**
 * @author ly
 * @Date: 2022/9/2 10:41
 *
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。
 * 这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 *
 * 何时使用：需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。
 * 如何解决：在被访问的类里面加一个对外提供接待访问者的接口。
 * 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
 * 注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
        ComputerPart computer = new Computer();
        computer.accept(computerPartVisitor);
    }
}
