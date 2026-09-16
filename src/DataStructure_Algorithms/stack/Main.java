package DataStructure_Algorithms.stack;

import java.util.Stack;

public class Main {
    public static void main(){

        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("skyrim");
        stack.push("Doom");
        stack.push("BorderLands");
        stack.push("FFVII");

        //Stack
        System.out.print("=============================> Stack\n");
        System.out.println(stack);

        //empty : is stack empty
        System.out.print("=============================> Empty\n");
        System.out.println(stack.empty());

        //pop : remove top most object from stack
        System.out.print("=============================> Stack\n");
        String myLastGame = stack.pop();
        System.out.println(stack);
        System.out.println(myLastGame);
        System.out.println(stack);

        //peek : Getting the top most object without removing it
        System.out.println("=============================> Peek\n");
        String myLeastGame = stack.peek();
        System.out.println(stack);
        System.out.println(myLeastGame);

        //search : returns specific position of given object
        System.out.println("=============================> Search\n");
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("FFVII"));

        // stack : LIFO , store objects into a sort of vertical tower
    }
}
