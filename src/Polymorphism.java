
//Polymorphism.java
public class Polymorphism {
     public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1200);
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Wheel[] wheels = { bicycle, boat, vehicle };
        for(Wheel wheel : wheels){
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
