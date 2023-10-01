package Examples;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        int lowerInterval, upperInterval, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower interval : ");
        lowerInterval = scan.nextInt();
        System.out.print("Enter the upper interval : ");
        upperInterval = scan.nextInt();
        scan.close();

        for (i = lowerInterval; i <= upperInterval; i++) {
            int product = 0, temp = i;
            int digitLength = String.valueOf(i).length();
            while (temp != 0) {
                int digit = temp % 10;
                product += Math.pow(digit, digitLength);
                temp /= 10;
            }

            if (product == i) {
                System.out.println(i);
            }
        }
    }
}
