package Kavya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ass2switchstatm {
    public static void main(String[] args) throws IOException {
        int week;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter week number");
        week = Integer.parseInt(br.readLine());
        switch (week) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("invalid week number");

        }
    }
}