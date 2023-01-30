package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeinnumwords {
    public static void main(String[] args) throws IOException {
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number");
        int num=Integer.parseInt(br.readLine());
        for(int i=2;i<=num/2;i++) {
            if ((num % i == 0))
                count++;
        }
        if (count==0) {
            System.out.println("prime");
        }
            else{
                System.out.println("not prime num");
            }
        }
    }

