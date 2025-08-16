import java.util.Scanner;

public class HashingOfnum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
    }
    //precomputation
    int hash[]=new int[13];
    for(int i=0;i<=n-1;i++) {
        hash[arr[i]]+=1;
    }

    int q=sc.nextInt();
    while (q>0) {
        int num=sc.nextInt();
    //fetching
        System.out.println(hash[num]);
        q--;
    }


    }
}
