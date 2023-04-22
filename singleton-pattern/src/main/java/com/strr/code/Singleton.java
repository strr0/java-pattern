package com.strr.code;

public class Singleton {
    // 饿汉式
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }

    // 懒汉式
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
