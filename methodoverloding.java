package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methodoverloding {
    public static void main(String[] args) throws IOException {
        clc(15,24);
        clc(34,24,15);
        cal(50,20,10);
        cal(50,20);
    }
    public static void clc(int n1,int n2){
        System.out.println(n1+n2);
    }
    public static void clc(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
   public static void cal(int n1,int n2) {
       System.out.println(n1-n2);
   }
   public static void cal(int n1,int n2,int n3){
       System.out.println(n1-n2-n3);
   }
}
