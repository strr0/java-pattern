package com.strr.code;

import com.strr.code.color.Color;
import com.strr.code.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
