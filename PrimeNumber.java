import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: which you want to check"); 
        int number=scanner.nextInt();
        if(number<=1){
            System.out.println(number+" is not a prime number");
             return;
        }
            
           
           for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println(number+" is not a prime number");
                return;
            }
    }
    System.out.println(number+" is a prime number");
   
}     
}