package Examples;

import java.util.Scanner;

//To find the factorial of a number
public class Program12 {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        scan.close();
        int result = fact(n);
        System.out.println("Fcatorial of " + n + " is " + result);
    }
}
