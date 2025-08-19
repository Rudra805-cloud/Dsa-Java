import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>name=new HashMap<>();
        //incert element
        name.put("India", 1);
        name.put("America", 0);
        name.put("japan", -1);
        name.put("china",4);
        //search element 

        if(name.containsKey("japan")){
            System.out.println("key is persent");
        }
        else{
            System.out.println("key is not persent");
        }

        //Value at key
        name.get("japan");


        //iteration in hashmap
        for(Map.Entry<String,Integer>e:name.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());


        }
       // remove element
        name.remove("china");
        System.out.println(name);
    }
}
