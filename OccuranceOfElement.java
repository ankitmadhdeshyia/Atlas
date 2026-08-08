public class OccuranceOfElement {
    public static boolean isSorted(int[]arr){
        if(arr==null || arr.length<=1){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={191,22,3,45};
        if(isSorted(arr)){
            System.out.println("array is soretd");
        }else{
            System.out.println("array is not sorted");
        }
      

       
      
    }
}
