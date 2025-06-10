package ShapeExample.visitor;

import ShapeExample.shape.Circle;
import ShapeExample.shape.Rectangle;
import ShapeExample.shape.Square;

public class SvgExporterVisitor implements Visitor {
     @Override
    public void visitCircle(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\"/>" );
    }

    @Override
    public void visitRectange(Rectangle rectangle) {
       System.out.println("<rect width=\"" + rectangle.getWidth() +
       "\" height = \"" + rectangle.getHeight()+ "\"/>");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("<square side=\"" + square.getSide() + "\"/>" );
    }
}
