package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calci {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        add(n1,n2); sub(n1,n2); mul(n1,n2); div(n1,n2);
    }
    public static void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public static void sub(int n1,int n2){
        System.out.println(n1-n2);
    }
    public static void mul(int n1,int n2){
        System.out.println(n1*n2);
    }
    public static void div(int n1,int n2){
        System.out.println(n1/n2);
    }
}
