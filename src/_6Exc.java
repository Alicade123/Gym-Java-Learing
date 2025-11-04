import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _6Exc {
    public void calculator(){
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter the first Number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second Number: ");
            int secondNumber = scanner.nextInt();
            String clear = scanner.nextLine();

            while(true){
                System.out.print("Enter the Operator or Enter Q to quit: ");
                char operator = scanner.next().charAt(0);
                if(operator == 'Q'){
                    System.out.println("Bye! Thank you for using this program. Copyright@Alicade"+new Date());
                    break;
                }
                int results = 0;
                switch(operator){
                    case '+':
                        results = firstNumber + secondNumber;
                        break;
                    case '-':
                        results = firstNumber - secondNumber;
                        break;
                    case '*':
                        results = firstNumber * secondNumber;
                        break;
                    case '/':
                        results = firstNumber / secondNumber;
                        break;
                    case '%':
                        results = firstNumber % secondNumber;
                        break;
                    case '^':
                        results = (int)Math.pow(firstNumber, secondNumber);
                        break;
                    case 's':
                        results = (int)Math.sqrt(firstNumber);
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                System.out.println(firstNumber + " " + secondNumber + " : " + results);

            }
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.print(e.getMessage());
        }finally{
            System.out.println("This is final block");
            scanner.close();
        }

    }

}
