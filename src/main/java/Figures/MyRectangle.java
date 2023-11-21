package Figures;

/* Finally, the MyCircle and MyRectangle Final classes should extend Circle and Rectangle respectively,
store the color attribute and implement a getDescription method, as shown below.
 */
public final class MyRectangle extends Rectangle {
    final String color;

    public MyRectangle (String name, double width, double length, String color){
        super(name, width, length);
        this.color = color;
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
         System.out.println(String.format("My %s Rectangle has %.2f perimeter and %.2f area.",
                 color,calculatePerimeter(), calculateArea()));
    }

}