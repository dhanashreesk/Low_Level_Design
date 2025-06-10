package shape;

import Visitor.Visitor;

public interface Shape {
     void accept(Visitor visitor);
}
