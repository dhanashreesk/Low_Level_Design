package ShapeExample.visitor;

import ShapeExample.shape.Circle;
import ShapeExample.shape.Rectangle;
import ShapeExample.shape.Square;

public class JsonExporterVisitor implements Visitor{

    @Override
    public void visitCircle(Circle circle) {
        System.out.println( "{\"type\" : \"circle\" , \"radius\":" + circle.getRadius() + "}");
    }

    @Override
    public void visitRectange(Rectangle rectangle) {
        System.out.println( "{\"type\" : \"rectangle\" , \"width\":" + rectangle.getWidth() + ", \"height\": "+rectangle.getHeight() +"}");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println( "{\"type\" : \"square\" , \"side\":" + square.getSide() + "}");
    }
}
