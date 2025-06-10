package ShapeExample.shape;

import ShapeExample.visitor.Visitor;

public class Square implements Shape {

    private Double side;

    public Square(Double side){
        this.side = side;
    }

    public Double getSide(){
        return side ; 
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitSquare(this);
    }
}
