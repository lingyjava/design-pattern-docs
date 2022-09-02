package com.ly.pattern.visitor;

/**
 * @author ly
 * @Date: 2022/9/2 10:45
 *
 * 计算机零件
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
