package com.strr;

import com.strr.code.Subject;
import com.strr.code.observer.BinaryObserver;
import com.strr.code.observer.HexaObserver;
import com.strr.code.observer.OctalObserver;

/**
 * 观察者模式
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 */
public class Application {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
    }
}
