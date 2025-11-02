// 26. Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.*;
public class RemoveDublicate {
    public static void main(String[] args) {
        int arr[]={13,13,15,15,18,18,19};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
                
            }
        
        }
       System.out.println(j+1);
    }


}
