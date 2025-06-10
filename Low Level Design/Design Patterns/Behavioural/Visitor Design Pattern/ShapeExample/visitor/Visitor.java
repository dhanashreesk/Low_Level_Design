package ShapeExample.visitor;
import ShapeExample.shape.Circle;
import ShapeExample.shape.Rectangle;
import ShapeExample.shape.Square;
public interface Visitor {

    void visitCircle(Circle circle);
    void visitRectange(Rectangle rectangle);
    void visitSquare(Square square);
    
}
