package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){

            public void sound() {
                System.out.print("The strange Bella is Wooh Wooh");
            }
        };
        dog1.sound();
        dog2.sound();

    }
}
