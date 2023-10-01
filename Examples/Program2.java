package Examples;

import java.util.Scanner;

//Java program to mutiply to floating point numbers.
public class Program2 {
    public static void main(String[] a) {
        float f1, f2, result;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first the number : ");
        f1 = reader.nextFloat();
        System.out.print("Enter the second the number : ");
        f2 = reader.nextFloat();
        result = f1 * f2;
        System.out.println("Result = " + result);
        reader.close();
    }

}
