import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    //Hashset contens only unique value like set in math 
    public static void main(String[] args) {
        //syntax
        HashSet<Integer> name=new HashSet<>();
        //add element 
        name.add(1);
        name.add(2);
        name.add(3);
        name.add(8);
        name.add(1);
        //Serch elements 
        if(name.contains(8)){
            System.out.println("element is persent");

        }
        if(!name.contains(6)){
                System.out.println("element is not persent");
        }
        //Delete element
        name.remove(3);
        //size
        name.size();
        //elements of set
        System.out.println(name);
        //Iterator in hashset elements 
         Iterator i=name.iterator();
         while (i.hasNext()) {
            System.out.println(i.next());
            
         }
    }
}
