package Threading;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // To finish our program while main thread finishes execution
        thread.start();

        System.out.println("Please!, You have 5 Seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: "+name);

    }
}
