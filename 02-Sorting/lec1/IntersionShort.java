import java.util.Scanner;

public class IntersionShort {
    public static void IntersionShort (int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0&& arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
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
        IntersionShort(arr,n);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    }

    }
}
