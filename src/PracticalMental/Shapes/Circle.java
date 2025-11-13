package PracticalMental.Shapes;

public class Circle extends Shape{
    private double radius;
    private final double Pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        String f= String.format("%.2f",Pi*radius*radius);
        return Double.parseDouble(f);
    }
    /*


     */
}
