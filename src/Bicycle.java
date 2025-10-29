//Bicycle.java
public class Bicycle extends Wheel {
    Bicycle(){
        super(202_000);;
    }
    @Override
    public void start(){
        System.out.println("The bicycle is starting to move");
        System.out.println("The Cost of this Bicycle is: " + getCost());
        System.out.println();
    }
}
