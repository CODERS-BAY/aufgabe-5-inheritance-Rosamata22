package Figures;
import Figures.AbstFigure;
import Figures.IFigure;

/*The Circle and the Rectangle classes should extend the abstract Figure class,
initialize with the corresponding figure name and respective attributes
(radius, length, width),and furthermore implement the two methods of the Interface
computing the area and the perimeter of figures.*/
public class Circle extends AbstFigure implements IFigure {
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
}
