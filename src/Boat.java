//Boat.java
public class Boat extends Wheel{
    Boat(){
        super(500_000_000);
    }
    @Override
    public void start(){
        System.out.println("The boat is starting to move");
        System.out.println("The Cost of this boat is: " + getCost());
        System.out.println();
    }
}
