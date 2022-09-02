package com.ly.pattern.visitor;

/**
 * @author ly
 * @Date: 2022/9/2 10:46
 *
 * 访问者
 */
public interface ComputerPartVisitor {

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Computer computer);
}
