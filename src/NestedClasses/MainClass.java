package NestedClasses;

public class Main {
    public static void main(){
        Outer outer = new Outer(); // instance of outer
        Outer.Inner inner = outer.new Inner(); //instance of inner
        System.out.println(outer.x+inner.y); //accessing their variables

        outer.stateLanguage(); //Accessing their method
        inner.stateDeveloper();

    }
}
