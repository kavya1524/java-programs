package Kavya;

import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter name:");
        String str=k.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        {
            if (str.equals(rev))
                System.out.println("Palindrome String");
           else
                System.out.println("not a Palindrome String");
        }
    }
}
