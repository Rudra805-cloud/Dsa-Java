import java.util.Scanner;

public class Primenum {
    public static boolean Prime(int n) {
        int count=0;
        //logic-1  TC=>o(n)
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        //Logic 2 TC=>O(sqrt(n))
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
System.out.println(Prime(n));
}

}
