import java.util.*;

// *Largest element in an arry By shorting*
public class LargestElementinARRAY {
    // public static int[]  shortArray(int arr[]) {
    //     int n = arr.length;
    //     for (int i = 1; i <= n - 1; i++) {
    //         int j = i;
    //         while (j > 0 && arr[j -1] > arr[j]) {
    //             int c = arr[j - 1];
    //             arr[j - 1] = arr[j];
    //             arr[j] = c;
    //             j--;
    //         }

    //     }
    //    return arr;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the size of array");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for (int i = 0; i <= n - 1; i++) {
    //         System.out.println("enter new element");
    //         arr[i] = sc.nextInt();
    //     }
    //     int[] arrShorted=shortArray(arr);
       
    //     int Largestelement=arrShorted[arrShorted.length-1];
    //     System.out.println(Largestelement);
    // }
 // Time Complexity: O(N)
// Space Complexity: O(1)

// #### without shorting####
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
    }
   int max= Largestelement(arr);
    System.out.println(max);
}
public static int Largestelement(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
     if(arr[i]>max){
        max=arr[i];
     }
    }
    return max;
}

}





