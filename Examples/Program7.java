package Examples;

import java.util.Scanner;

//Program to find largest of three integers.
public class Program7 {

    public static void main(String args[]){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = scan.nextInt();
        System.out.print("Enter the second number : ");
        b = scan.nextInt();
        System.out.print("Enter the third number : ");
        c = scan.nextInt();
        scan.close();

        if (a>b && b>c){
            System.out.println(a + " is greater than " + b + " & " + c);
        }
        else if (b>c && b>a){
            System.out.println(b + " is greater than " + a + " & " + c);
        }else{
            System.out.println(c + " is greater than " + a + " & " + b);
        }
    }
    
}
