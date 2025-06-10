package ShapeExample.shape;

import ShapeExample.visitor.Visitor;


public class Circle implements Shape{
    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
