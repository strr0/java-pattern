package com.strr.code;

import com.strr.code.AbstractFactory;
import com.strr.code.color.Color;
import com.strr.code.shape.Circle;
import com.strr.code.shape.Rectangle;
import com.strr.code.shape.Shape;
import com.strr.code.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
