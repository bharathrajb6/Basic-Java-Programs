package Examples;

import java.util.Scanner;

//to print an armstrong number
public class Program19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        scan.close();
        int numberLength = String.valueOf(number).length();
        int product = 0;
        int temp=number;
        while(temp!=0){
            int digit=temp%10;
            product+=Math.pow(digit, numberLength);
            temp/=10;
        }
        if(product==number){
         System.out.println(number+" is an Armstrong Number.");
        }else{
            System.out.println(number+" is not an Armstrong Number.");
        }
    }
}
