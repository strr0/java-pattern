package com.strr;

import com.strr.code.Context;
import com.strr.code.state.StartState;
import com.strr.code.state.StopState;

/**
 * 状态模式
 * 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 */
public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
