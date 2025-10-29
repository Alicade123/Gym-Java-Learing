import java.util.Date;
import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("The Menus");
            System.out.println("----------------");
            System.out.println();
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("0. exit");
            System.out.println();
            System.out.print("Choose a Shape:");
            int choice = input.nextInt();

            if(choice == 1){
            System.out.println("You chosen the shape 1: Triangle");
            System.out.print("Enter Base: ");
            int base = input.nextInt();
            System.out.print("Enter the heigh: ");
            int height = input.nextInt();
            findAreaTriangle(base, height);
        }
            else if(choice == 2){
                System.out.println("You chosen the shape 2: Rectangle");
                System.out.print("Enter length: ");
                int length = input.nextInt();
                System.out.print("Enter Width: ");
                int width = input.nextInt();
                findAreaRectangle(length, width);
            }
            else if(choice == 3){
                System.out.println("You chosen the shape 3: Square");
                System.out.print("Enter the side of you square: ");
                int side = input.nextInt();
                findAreaSquare(side);
            }
            else if (choice == 4){
                System.out.println("You chosen the shape 4: Circle");
                System.out.print("Enter the radius of you circle: ");
                int radius = input.nextInt();
                findAreaCircle(radius);
            }
            else if(choice == 0){
                quite();
                break;
            }
        }
        input.close();

    }
    public static void findAreaTriangle(int b, int h){
        int A = (b*h)/2;
        System.out.println("The Area of a Triangle is " + A);
    }
    public static void findAreaRectangle(int l, int w){
            int A =  (l*w);
            System.out.println("The Area of a Rectangle is " + A);
    }
    public static void findAreaSquare(int s){
        int A = (s*s);
        System.out.println("The Area of a Square is " + A);
    }
    public static void findAreaCircle(int radius){
        double A = Math.PI * (radius*radius);
        String formatA = String.format("%.2f",A);
        System.out.print("The Area of a Circle is: " + formatA);
    }
    public static void quite(){
        String time = new Date().toString();
        System.out.println("Exiting Program\nThank you for using our program.\ncopyright@Alicade"+time);
    }

}


