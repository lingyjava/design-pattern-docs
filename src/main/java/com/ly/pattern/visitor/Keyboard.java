package com.ly.pattern.visitor;

/**
 * @author ly
 * @Date: 2022/9/2 10:47
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
