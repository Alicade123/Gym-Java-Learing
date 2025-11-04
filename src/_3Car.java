public class _3Car extends _3Vehicle {
    public _3Car(){
        super("black", "SUV");
    }
    @Override
    public void go(int made){
        System.out.println("The "+ _3Vehicle.driver +" is driving the "+this.color +"-"+this.carName+" of " +made +" !");
    }

}
