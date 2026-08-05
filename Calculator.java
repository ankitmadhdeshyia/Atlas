import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int attempt=0;
        while(attempt<5){
        System.out.println("Enter the operator(+,-,*,/) ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);

                break;
            case '*':
                System.out.println(a * b);

                break;
            case '/':
                if (b == 0) {
                    System.out.println("cannot be divide by zero");
                } else {

                    System.out.println(a / b);
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
    

    }
}