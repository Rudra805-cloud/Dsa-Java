import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        
        List<Integer>num=new ArrayList<Integer>();
        //add element
         num.add(3);
        num.add(7);
        num.add(8);
        num.add(8);
       int a=num.indexOf(8);
       if(a!=0){
       System.out.println("index of 8 is"+a);
       System.out.println(" ");

       }
       else{
        System.out.println("index is not found");
       }

    }
}
