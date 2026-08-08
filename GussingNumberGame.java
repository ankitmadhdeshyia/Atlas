import java.util.*;
public class GussingNumberGame{
    public static int randomNumber(){
        int min=1,max=10;
        int randomInt=(int)(Math.random()*(max-min+1))+min;//print the random number
       return randomInt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int num2=randomNumber();
        int count=0;
        while(true){
         System.out.println("Enter your number");
        int num1=sc.nextInt();
         count++;
       if(num1==num2){
        System.out.println("Congratulation you won");
        System.out.println("Total Attempt"+count);
        break;
       }else if(num1<num2){
        System.out.println("Too Low Try Again");
       }else{
        System.out.println("Too high try again");
       }
      
     
    }
    
    }
}