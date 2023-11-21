package main;
 import Figures.AbstFigure;
 import Figures.IFigure;
 import Figures.Circle;
 import Figures.Rectangle;
 import Figures.MyCircle;
 import Figures.MyRectangle;


public class Figures {
    public static void main(String[] args) {

        // Uncomment the code below when you are done implementing

        MyCircle c1 = new MyCircle("circle c1",7, "blue");
        c1.getDescription();
        System.out.println();

        MyCircle c2 = new MyCircle("circle c2",3,"purple");
        c2.getDescription();
        System.out.println();

        MyRectangle r1 = new MyRectangle ("rectangle r1", 5, 2, "orange");
        r1.getDescription();
        System.out.println();

        MyRectangle r2 = new MyRectangle("rectangle r2",8,7, "red");
        r2.getDescription();
        System.out.println();

    }
}
