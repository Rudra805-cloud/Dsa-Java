import java.util.*;

public class searchTarget {
    public static void main(String[] args) {
      int arr[]={23,34,21,23};
      int target=33;
      int index=findtarget(target,arr);
      if(index>=0){
        System.out.println(index);
      }
      else if(index<0){
        System.out.println("Element is not found");
      }
    }
    static int findtarget( int target,int arr[]){
        for (int i=0;i<=arr.length-1;i++) {
            if (target==arr[i]) {
                return i;
            }
        }
        return -1;
        

 
    }

    
}

