import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int number2 = sc.nextInt();
        int attempt=0;
        while(attempt<5){
        System.out.println("Enter the operator(+,-,*,/) ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(number1 + number2);

                break;
            case '-':
                System.out.println(number1 - number2);

                break;
            case '*':
                System.out.println(number1 * number2);

                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("cannot be divide by zero");
                } else {

                    System.out.println(number1 / number2);
                }

                break;

            default:
                System.out.println("Invalid operator");
                break;
               
            }
             attempt++;
             System.out.println("invalid operator Attempts left"+(5-attempt));
        }
        System.out.println("You have used All Attempt");
    
sc.close();
    }
}