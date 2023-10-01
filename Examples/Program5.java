package Examples;

import java.util.Scanner;

// Program to check even or odd
public class Program5 {
    
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        if (number%2==0){
            System.out.println(number + " is an even number.");
        }
        else{
            System.out.println(number + " is an odd number.");
        }
        scan.close();
    }
}
