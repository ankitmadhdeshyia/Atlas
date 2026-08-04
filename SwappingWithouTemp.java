public class SwappingWithouTemp {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=b-a;
        b=c;
        a=b+c;
        System.out.println("After swapping a= "+a+" b= "+b);
    }
}
