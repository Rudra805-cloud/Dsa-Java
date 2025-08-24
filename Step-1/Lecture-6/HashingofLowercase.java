//only of lower case element is given

import java.util.Scanner;

public class HashingofLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       
        int hash[]=new int[26];
        //pre compute
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
          hash[ch-'a']++;
        }
        int q=sc.nextInt();
        while (q>0) {
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
            q--;
        }

        
    }
}
