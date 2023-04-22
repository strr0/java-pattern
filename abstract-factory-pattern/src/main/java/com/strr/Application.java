package com.strr;

import com.strr.code.AbstractFactory;
import com.strr.code.FactoryProducer;
import com.strr.code.color.Color;
import com.strr.code.shape.Shape;

/**
 * 抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 */
public class Application {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("blue");
        color.fill();
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
