package com.ly.pattern.visitor;

/**
 * @author ly
 * @Date: 2022/9/2 10:54
 */
public class Computer implements ComputerPart{

    private ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[] {new Monitor(), new Keyboard(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart cur : computerParts) {
            cur.accept(visitor);
        }
        visitor.visit(this);
    }
}
