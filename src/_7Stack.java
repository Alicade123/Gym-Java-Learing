
import java.util.Stack;

public class _7Stack {
 public static void main(String[] args){
     Stack <String> game = new Stack<String>();

        game.push("Call of Duty");
        game.push("Red Dead Redemption 2");
        game.push("Halo Infinite");
        game.push("Elden Ring");
        game.push("God of War");
        game.push("Apex Legends");
     System.out.print(game);
     System.out.println();
    System.out.println(game.push("Counter Strike"));//1. push()
     System.out.println(game.pop());//2.pop()
     System.out.println(game.peek());// 3.peek()
     System.out.println(game.size()); //4.size()
     System.out.println(game.isEmpty()); // 5. isEmpty() -> Boolean Value whether isEmpty or not
//     System.out.println(game.isFull()); //5. isFull() for bounded Stack
 }

}
