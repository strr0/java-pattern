package com.strr.code;

import com.strr.code.AbstractFactory;
import com.strr.code.color.Blue;
import com.strr.code.color.Color;
import com.strr.code.color.Green;
import com.strr.code.color.Red;
import com.strr.code.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
