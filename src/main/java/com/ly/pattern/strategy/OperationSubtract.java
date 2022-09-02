package com.ly.pattern.strategy;

/**
 * @author ly
 * @Date: 2022/9/2 10:02
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
