import java.util.Scanner;

public class HashingofChar {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s= sc.next();
        int hash[]=new int[256];    //no of character 256
        //pre Compute
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        int q=sc.nextInt();
        while (q>0) {
            char ch=sc.next().charAt(0);
            //fetching
            System.out.println(hash[ch]);
            
        }


    }
    
}
