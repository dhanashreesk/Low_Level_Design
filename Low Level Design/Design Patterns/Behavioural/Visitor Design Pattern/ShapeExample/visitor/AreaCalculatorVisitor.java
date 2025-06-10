package ShapeExample.visitor;

import ShapeExample.shape.Circle;
import ShapeExample.shape.Rectangle;
import ShapeExample.shape.Square;

public class AreaCalculatorVisitor implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
      Double area = Math.PI * circle.getRadius()*circle.getRadius();
      System.out.println("Area of Circle :" + area);
    }

    @Override
    public void visitRectange(Rectangle rectangle) {
       Double area = rectangle.getHeight()*rectangle.getWidth();
       System.out.println("Area of Rectangle : "+area);
    }

    @Override
    public void visitSquare(Square square) {
      Double area = square.getSide()*square.getSide();
      System.out.println("Area of Square :" + area);
    }
}
