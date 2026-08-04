public class LargestElementInArray {
    public static void main(String[] args) {
       int [] marks={12, 45, 67, 89, 23, 56};
       int temp=marks[0];
       for(int i=0;i<marks.length;i++){
        if(marks[i]>temp){
            temp=marks[i];

        }
       }
       System.out.println("The largest element in the array is: " + temp);
    }
}