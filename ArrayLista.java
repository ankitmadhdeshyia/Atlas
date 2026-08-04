import java.util.*;
public class ArrayLista {
    public static void main(String[] args) {
       ArrayList<Integer> l1=new ArrayList<>(); 
       ArrayList<Integer> l2=new ArrayList<>(3); 
       l2.add(104);
       l2.add(106);
       l2.add(108);
       l1.add(6);
       l1.add(16);
       l1.add(26);
       l1.add(36);
       l1.add(46);
       l1.add(5,98 );
       l1.addAll(l2);
       for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i));
        System.out.print(",");
       }
    }
}
