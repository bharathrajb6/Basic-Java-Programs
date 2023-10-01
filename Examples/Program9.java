package Examples;

import java.util.Scanner;

//Program to check the number is positie or negative.
public class Program9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        scan.close();

        if (number >= 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negetive number.");
        }
    }

}
