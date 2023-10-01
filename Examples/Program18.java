package Examples;

import java.util.Scanner;

//print prime number within the interval
public class Program18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower interval : ");
        int lowerInterval = scan.nextInt();
        System.out.print("Enter the higher interval : ");
        int upperInterval = scan.nextInt();
        scan.close();

        for (int i = lowerInterval; i <= upperInterval; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }
    }
}
