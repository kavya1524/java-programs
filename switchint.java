package Kavya;

import java.util.Scanner;

public class switchint {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("command");
        int i= input.nextInt();
        switch (i){
            case 1:
                System.out.println("machine started!");
                break;
            case 0:
                System.out.println("machine stop");
                break;
            default:
                System.out.println("not recognized");
        }
    }
}
