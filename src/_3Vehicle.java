public  abstract class _3Vehicle {
    static String driver = "Robert";
    protected String color ;
    protected String carName;
    public _3Vehicle(String color, String name){
        this.color = color;
        this.carName = name;
    }
      abstract void go(int year);
}
