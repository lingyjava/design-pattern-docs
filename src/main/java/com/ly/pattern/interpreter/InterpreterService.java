package com.ly.pattern.interpreter;

/**
 * @author ly
 * @Date: 2022/9/1 8:57
 *
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 *
 * 构建语法树，定义终结符与非终结符。
 * 关键代码：构建环境类，包含解释器之外的一些全局信息，一般是 HashMap。
 *
 * 可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替。
 */
public class InterpreterService {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male ? " + isMale.interpreter("John"));
        System.out.println("Married Julie is Married women ? " + isMarriedWoman.interpreter("Married Julie ??????????"));
    }

    /**男性解释器*/
    public static Expression getMaleExpression() {
        //规则：Robert 和 John 是男性
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**已婚女性解释器*/
    public static Expression getMarriedWomanExpression() {
        //规则：Julie 是一个已婚的女性
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
