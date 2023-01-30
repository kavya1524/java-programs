package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ass1ifelse{
    public static void main(String[] args) throws IOException {
        int p,c,m;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of p");
        p=Integer.parseInt(br.readLine());
        System.out.println("enter the value of c");
        c=Integer.parseInt(br.readLine());
        System.out.println("enter the value of m");
        m=Integer.parseInt(br.readLine());
        int avg=(p+c+m)/3;
        if(p>35&&c>35&&m>35&&avg>40){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");

        }
    }
}
