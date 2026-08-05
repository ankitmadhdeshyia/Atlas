public class Recursion1 {
public static int powerCalculation(int x, int n){
   if(n==0){ //base case 1
       return 1;
     }
     if(x==0){//base case 2
         return 0;
     }

    int xPower=powerCalculation(x,n-1);
  int xPowerN=x*xPower;
  return xPowerN;
    }
    public static void main(String[] args) {
       int x=2;
       int n=5;
         int result=powerCalculation(x,n);
         System.out.println(result);
        
    }
}
