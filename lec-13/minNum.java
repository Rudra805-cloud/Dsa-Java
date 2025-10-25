import java.util.*;
public class minNum {
    public static void main(String[] args) {
       int arr[]={1,2,2,1,3,1};
       
       int Min=min(arr);
       System.out.println(Min);
    }
    static int min(int arr[]){
        int n=0;
       for (int i=0;i<arr.length-1;i++) {
        if(arr[i+1]<=arr[i]){
            n=arr[i+1];
        }
       }
       return n;
        
    }
          
}
