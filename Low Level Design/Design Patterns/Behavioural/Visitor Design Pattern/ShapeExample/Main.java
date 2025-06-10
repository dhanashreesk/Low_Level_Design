package ShapeExample;
import java.util.List;

import ShapeExample.shape.Circle;
import ShapeExample.shape.Rectangle;
import ShapeExample.shape.Shape;
import ShapeExample.shape.Square;
import ShapeExample.visitor.AreaCalculatorVisitor;
import ShapeExample.visitor.JsonExporterVisitor;
import ShapeExample.visitor.SvgExporterVisitor;
import ShapeExample.visitor.Visitor;
public class Main {
    public static void main(String[] args) {
        List <Shape> shapes = List.of(
            new Circle(5.0),
            new Rectangle(10.0,4.0),
            new Square(10.0)
        );

        System.out.println(" Calculating Areas ");
        Visitor areaCalculator = new AreaCalculatorVisitor();
        for(Shape shape : shapes){
            shape.accept(areaCalculator);
        }

        System.out.println(" Exporting to SVG ");
        Visitor svgExporter = new SvgExporterVisitor();
        for(Shape shape : shapes){
            shape.accept(svgExporter);
        }

        System.out.println(" Exporting JSON ");
        Visitor JsonExporter = new JsonExporterVisitor();
        for(Shape shape : shapes){
            shape.accept(JsonExporter);
        }

    }
}
