package com.strr;

import com.strr.code.Context;
import com.strr.code.strategy.OperationAdd;
import com.strr.code.strategy.OperationMultiply;
import com.strr.code.strategy.OperationSubtract;

/**
 * 策略模式
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 */
public class Application {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
