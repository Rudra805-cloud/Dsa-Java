import java.util.Scanner;

public class ArrayBubleShort {
   public static void BubbleShort(int n,int arr[]){
    for(int i=n-1;i>=0;i--){
      for(int j=0;j<=i-1;j++){
         if(arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
         }
      }

    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++){
      arr[i]=sc.nextInt();
       }

       System.out.println();
       BubbleShort(n, arr);
       
       for(int i=0;i<=n-1;i++){

           System.out.println(arr[i]);

      }


   } 
}
