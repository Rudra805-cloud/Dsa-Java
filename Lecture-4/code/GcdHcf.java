import java.util.Scanner;

public class GcdHcf {
    
public static void gcd(int a,int b){
    while(a>0 && b>0){
     if(a>b){
        a=a%b;
     }
     else{
        b=b%a;
     }
     if(a==0){
        System.out.println(b);
     }
     else{
        System.out.println(a);
     }
    }
}
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   gcd(a, b);




}

}
