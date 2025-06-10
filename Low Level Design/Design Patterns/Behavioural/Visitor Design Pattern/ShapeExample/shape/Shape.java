package ShapeExample.shape;

import ShapeExample.visitor.Visitor;

public interface Shape {
     void accept(Visitor visitor);
}
