package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("day");
        String text = br.readLine();
        switch (text){
            case "T":
                System.out.println("k's birthday");
                break;
            case "Sunday":
                System.out.println("l's birthday");
                break;
            default:
                System.out.println("other wise invalid");
        }

    }
}
