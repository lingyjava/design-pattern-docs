package com.ly.pattern.chain;

/**
 * @author ly
 * @Date: 2022/8/30 14:34
 *
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * 这种类型的设计模式属于行为型模式。
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 *
 * 在处理消息的时候以过滤很多道, 拦截的类都实现统一接口。
 */
public class ChainService {

    private static AbstractLogger getLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLogger();
        logger.logMessage(AbstractLogger.INFO, "Method executor");
        logger.logMessage(AbstractLogger.DEBUG, "InputParam is null");
        logger.logMessage(AbstractLogger.ERROR, "NullPointException");
    }

}
