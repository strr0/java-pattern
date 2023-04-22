package com.strr;

import com.strr.code.Singleton;

/**
 * 单例模式
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 */
public class Application {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.printf("s1 equals s2? %b", s1.equals(s2));
    }
}
