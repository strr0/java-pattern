package com.strr;

import com.strr.code.ShapeCache;
import com.strr.code.shape.Shape;

/**
 * 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 */
public class Application {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape.getType());
    }
}
