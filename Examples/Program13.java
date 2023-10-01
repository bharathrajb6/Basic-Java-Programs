package Examples;

import java.util.Scanner;

//Generation of multiplication table
public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
