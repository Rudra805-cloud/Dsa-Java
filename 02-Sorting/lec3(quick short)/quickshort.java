import java.lang.reflect.Array;
import java.util.*;
class Solution{
public static int partition( List<Integer>arr,int low ,int high){
  int piviot=arr.get(low);
  int i=low;
  int j=high;
  
   while (i<j) {
      while (i<=high-1 && arr.get(i)<=piviot) {
         i++;
      }
      while (j>=low+1 && arr.get(j)>piviot) {
         j--;
      }
      if(i<j){
         int temp=(arr.get(i));
         arr.set(i,arr.get(j));
         arr.set(j, temp);

      } 
   }
     int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
}

public static void qs(List<Integer>arr,int low,int high){
   if(low<high){
      int pIndex=partition(arr, low, high);
      qs(arr, low, pIndex-1);
      qs(arr, pIndex+1, high);
   }
}
   public static List<Integer> quickSort(List<Integer> arr) {
     
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
}

public class quickshort {
    public static void main(String[] args) {
       List<Integer> arr=new ArrayList<>();
          arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("Before Using  Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = Solution.quickSort(arr);
        System.out.println("After sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
   
   }

   

