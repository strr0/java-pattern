package com.strr;

import com.strr.code.AbstractLogger;
import com.strr.code.ConsoleLogger;
import com.strr.code.ErrorLogger;
import com.strr.code.FileLogger;

/**
 * 责任链模式
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 */
public class Application {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
//        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
//        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
