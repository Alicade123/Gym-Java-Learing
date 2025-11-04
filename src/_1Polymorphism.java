
//Polymorphism.java
public class _1Polymorphism {
     public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1200);
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        _1Wheel[] wheels = { bicycle, boat, vehicle };
        for(_1Wheel wheel : wheels){
            wheel.start();
        }
        Boat KivuQueen = new Boat();
        KivuQueen.learnToDrive();
        Vehicle Mazda = new Vehicle(30000);
        Mazda.stop();
        System.out.println(Mazda.getColor());
        Bicycle Matabaro = new Bicycle();
        Matabaro.destination();

        //Boat Titanic  = new Boat();
        //Titanic.crush(); //error: crush has private access modifier in wheel

    }
}
