package Examples;

import java.util.Scanner;

//Java Program to check the leap year
public class Program8 {
    public static void main(String[] args) {
        boolean leap = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scan.nextInt();
        scan.close();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
