package com.ly.pattern.interpreter;

/**
 * @author ly
 * @Date: 2022/9/1 9:03
 */
public class AndExpression implements Expression{

    private final Expression expression1;
    private final Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String content) {
        return expression1.interpreter(content) && expression2.interpreter(content);
    }
}
