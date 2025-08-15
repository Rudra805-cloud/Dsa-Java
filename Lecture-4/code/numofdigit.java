import java.util.Scanner;

public class numofdigit {
    static void  lastdigit(int num){
        while (num!=0){
           int ld =num%10;
            num=num/10;
            System.out.println(ld);
        }
        
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    lastdigit(num); 
    }

}