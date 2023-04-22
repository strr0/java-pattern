package com.strr;

import com.strr.code.decorator.RedShapeDecorator;
import com.strr.code.decorator.ShapeDecorator;
import com.strr.code.shape.Circle;
import com.strr.code.shape.Shape;

/**
 * 装饰器模式
 * 动态地给一个对象添加一些额外的职责。
 */
public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        circle.draw();
        redCircle.draw();
    }
}
