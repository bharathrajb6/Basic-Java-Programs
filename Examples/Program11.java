package Examples;

import java.util.Scanner;

//Print sum of natural numbers
public class Program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        scan.close();
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }

        System.out.println("Sum of " + number + " natural number is " + total);
    }
}
