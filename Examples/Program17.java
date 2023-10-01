package Examples;

import java.util.Scanner;

//print waether the given number is prime or not
public class Program17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + "It is not a prime number");
        }
    }
}
