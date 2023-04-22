package com.strr;

import com.strr.code.ShapeFactory;
import com.strr.code.shape.Shape;

/**
 * 工厂模式
 * 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 */
public class Application {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("square");
        shape.draw();
    }
}
