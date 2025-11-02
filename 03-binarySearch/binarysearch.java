import java.util.*;
public class binarysearch {

public static void main(String[] args){
    int arr[]={12,13,14,15,18,19};
    int target=18;
   int result= binarysearch(arr,target);
   System.out.println(result);
    
}
static int binarysearch(int arr[],int target){
    int start=0;
    int end=arr.length-1;
    
    while (start<=end) {
        int mid=start+(end-start)/2;
        if (target==arr[mid]) {
        return mid;
            
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        
    }
    return -1;

}    
}