package Examples;

import java.util.Scanner;

//to print the reverse of the given number
public class Program16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        scan.close();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse Number : " + reverse);
    }
}
