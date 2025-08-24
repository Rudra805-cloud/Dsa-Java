import java.util.*;

public class HashingusingMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();

        }
        HashMap<Integer,Integer>map=new HashMap<>();

        //pre-compute
        for(int i=0;i<=n-1;i++){
         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  
            // map[arr[i]]++;  =>in cpp
        
        }
        //itrate in map
          for(Map.Entry<Integer, Integer> e : map.entrySet()){
                System.out.println(e.getKey()+"->"+e.getValue());
                
          }
          


        int q=sc.nextInt();
        while (q>0) {
            int num=sc.nextInt();
            System.out.println(map.get(num));
            
        }


    }
}
