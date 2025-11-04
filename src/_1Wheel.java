//Wheel.java
public class _1Wheel {
    private int cost ;
    public _1Wheel(int price){
        if(price>0)this.cost = price;
    }
    public int getCost(){
        return cost;
    }

    public void start() {
        System.out.println("Wheel start");
    }
    public  void learnToDrive() {
        System.out.println("To drive & drive : Public");
    }

    protected  void stop() {
        System.out.println("Stop and Stop: protected!");
    }
    void destination(){
        System.out.println("I'm going to your location: Default!");
    }
    private  void crush() {
        System.out.println("Don't think to do so: private!");
    }

}