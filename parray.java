package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parray {
    public static void main(String[] args) throws IOException {
        int rows;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter pyramid rows=");
        rows = Integer.parseInt(br.readLine());
        BufferedReader k =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("symbols:");
        String str=k.readLine();
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(str+"\t");
            }
            System.out.println();
        }

    }
}
