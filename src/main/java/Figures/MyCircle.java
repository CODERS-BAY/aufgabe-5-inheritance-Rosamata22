package Figures;

public final class MyCircle extends Circle{
    final String color;

    public MyCircle(String name, double radius, String color){
        super(name, radius);
        this.color=color;
    }

    @Override
    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }

    @Override
    public double calculateArea(){
        return super.calculateArea();
    }

    public void getDescription(){
        System.out.println(String.format("My %s Circle has %.2f perimeter and %.2f area.",color,
                calculatePerimeter(),calculateArea()));
    }
}
