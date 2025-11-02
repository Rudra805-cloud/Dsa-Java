import java.util.*;

public class searchin2Darray {

    public static void main(String[] args) {
        int arr[][]={
            {12,13,12},
            {23,4,21},
            {123,331,2,3,2,3},
        };
         
        int target=19;
        int index[]=findtarget(target,arr);
        for (int i=0;i<=index.length-1;i++) {
           
            if(index[i]>=0){
            System.err.println(index[i]);
           }
           else{
            System.out.println("element not found");
           }
        }
    }
    static int[] findtarget(int target,int arr[][]){
        for(int i=0;i<=arr.length-1;i++){
             for(int j=0;j<=arr[i].length-1;j++){
           if(target==arr[i][j]){
            int result[]={i,j};
            return result;
           }
        }
        }
        return new int[]{-1,-1};
    }
    
}
