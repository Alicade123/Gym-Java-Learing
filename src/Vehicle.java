//Vehicle.java
public class Vehicle extends Wheel {
    Vehicle(int price){
        super(price);
    }
    String color;
    public String getColor(){
return color;
    }
    @Override
    public void start(){
        System.out.println("The Vehicle is starting to move");
        System.out.println("The Cost of this Vehicle is: " + getCost());
        System.out.println();

    }
}
