package Figures;
import Figures.AbstFigure;
import Figures.IFigure;
/*The Circle and the Rectangle classes should extend the abstract Figure class,
initialize with the corresponding figure name and respective attributes
(radius, length, width),and furthermore implement the two methods of the Interface
computing the area and the perimeter of figures.*/
public class Rectangle extends AbstFigure implements IFigure {
    private double width;
    private double length;

    public Rectangle (String name, double width, double length){
        super(name);
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(width+length);
    }

    @Override
    public double calculateArea(){
        return width*length;
    }
}
