package PracticalMental.Shapes;

import java.util.Arrays;

public class MainShape {

    public static void main(String[] arg) {
        Shape shape = new Shape();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,9);
/*
        System.out.println("Area of the shape is "+shape.area());
        System.out.println("Area of the circle is "+circle.area());
        System.out.println("Area of the circle is "+rectangle.area());
 */
    Shape [] shapes = {shape, circle, rectangle};
        for(Shape shp:shapes){
        System.out.println("The Area is: "+ shp.area());
         }


    }
}
