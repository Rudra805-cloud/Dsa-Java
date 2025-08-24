//selection short 

import java.util.*;

public class SelectionShort {
    
    
    public static void  Short_selection(int arr[],int n){
      for(int i=0;i<=n-2;i++){
        int min =i;
        for(int j=i;j<=n-1;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
            int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
        }
      }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
           arr[i]=sc.nextInt();
        }
     
        System.out.println();
        Short_selection(arr,n);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    }

    }
}

