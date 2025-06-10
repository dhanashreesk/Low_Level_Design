package ShapeExample.shape;

import ShapeExample.visitor.Visitor;

public class Rectangle implements Shape{

    private Double width;
    private Double height;

    public Rectangle (Double width , Double height){
        this.width = width;
        this.height = height;
    }

    public Double getWidth(){
        return width;
    }

    public Double getHeight(){
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectange(this);
    }

}
