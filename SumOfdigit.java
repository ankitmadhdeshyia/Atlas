public class SumOfdigit {
    public static void main(String[] args) {
      int number = 12345; // Example number
      int rev=0;
      while(number !=0){
        int div=number%10;
        rev=rev+div;
        number=number/10;
      }  
      System.out.println("Sum of digits: " + rev);
    }
}
