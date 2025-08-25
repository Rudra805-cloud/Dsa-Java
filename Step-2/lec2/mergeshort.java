import java.util.*;
public class mergeshort {
    
     public static void mergeshort(int arr[],int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeshort(arr, low, mid);
        mergeshort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        int left =low;
        int right=mid+1;
    ArrayList<Integer>temp=new ArrayList<>();
    while (left<=mid&&right<=high) {
        if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
    }
    while (left<=mid) {
        temp.add(arr[left]);
        left++;
        
    }
    while (right<=high) {
        temp.add(arr[right]);
        right++;
    }

    for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);

    }
    }





    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeshort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
