package com.strr.code;

import com.strr.code.AbstractFactory;
import com.strr.code.ColorFactory;
import com.strr.code.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
