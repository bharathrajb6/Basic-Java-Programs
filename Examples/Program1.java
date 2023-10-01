package Examples;

import java.util.Scanner;

//This program is to add two integers.
public class Program1 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int val1,val2,result;
        System.out.print("Enter the first number : ");
        val1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        val2 = scan.nextInt();
        scan.close();
        result = val1 + val2;
        System.out.println("Result = "+ result);
    }
}
