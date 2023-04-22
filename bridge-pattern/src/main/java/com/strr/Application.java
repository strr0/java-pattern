package com.strr;

import com.strr.code.draw.RedCircle;
import com.strr.code.shape.Circle;
import com.strr.code.shape.Shape;

/**
 * 桥接模式
 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
 */
public class Application {
    public static void main(String[] args) {
        Shape shape = new Circle(100,100, 10, new RedCircle());
        shape.draw();
    }
}
