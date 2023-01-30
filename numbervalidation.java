package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class hpskm{
    String regex="^(?:9|8|7)\\d{9}$";
    String number;
    public void set(String str){
        if (str.matches(regex)){
        System.out.println("correct phone number set");
        this.number=str;
    }else{
            System.out.println("wrong phone number is given");
        }
    }
}
public class numbervalidation {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter phone number:");
        String f= br.readLine();
        hpskm m=new hpskm();
        m.set(f);
    }
}
