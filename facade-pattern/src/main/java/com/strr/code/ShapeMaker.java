package com.strr.code;

import com.strr.code.shape.Circle;
import com.strr.code.shape.Rectangle;
import com.strr.code.shape.Shape;
import com.strr.code.shape.Square;

public class ShapeMaker {
    private Shape circle;

    private Shape rectangle;

    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
