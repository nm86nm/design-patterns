package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType shapeType){
        Shape shape = shapes.get(type);

        if(shape == null) {
            if (shapeType.equals(ShapeType.OVAL_FILL)) {
                shape = new Oval(true);
            } else if (shapeType.equals(ShapeType.OVAL_NOFILL)) {
                shape = new Oval(false);
            } else if (shapeType.equals(ShapeType.LINE)) {
                shape = new Line();
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }

    public static enum ShapeType{
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
