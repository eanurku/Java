package com.anurag;

import com.anurag.models.Circle;
import com.anurag.models.Rectangle;
import com.anurag.models.Shape;
import com.anurag.models.Square;

public class ShapeFactory {

   public static Shape getInstance(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }
        return null;

    }

}
