package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraytriangle {
    public static void main(String[] args) throws IOException {
        int rows;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter pyramid rows=");
        rows = Integer.parseInt(br.readLine());
        BufferedReader k =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("symbols:");
        String str=k.readLine();
        for (int i=1;i<=rows; i++)//r=3 i=3,2,1
        {
            for (int j=0;j<=rows-i;j++){ // 3-1,2-1,1-1;
                System.out.print("\t");
            }
            for (int l=0;l<(i*2)-1;l++) // 1*2-1,2*2-1,3*2-1
            {
                System.out.print(str+"\t");
            }
            System.out.println();
        }

    }
}
