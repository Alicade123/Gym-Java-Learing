package ENUMS;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {

        try{
            Scanner scanner =new Scanner(System.in);
            System.out.print("Enter the day of the week: ");
            String input = scanner.next();
            Day day = Day.valueOf(input.toUpperCase());
            switch (day) {
                case SUNDAY->System.out.println("Sunday");
                case MONDAY -> System.out.println("Monday");
                case TUESDAY -> System.out.println("Tuesday");
                case WEDNESDAY  -> System.out.println("Wednesday");
                case THURSDAY    -> System.out.println("Thursday");
                case FRIDAY     -> System.out.println("Friday");
                case SATURDAY    -> System.out.println("Saturday");
                case PIZZADAY -> System.out.println("Pizzaday");
            }
        }catch(Exception e){
            System.out.println("Invalid input day");
        }


    }
}
