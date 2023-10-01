package Examples;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = scan.next().charAt(0);
        scan.close();

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a character.");
        } else {
            System.out.println(ch + " is not a characater.");
        }

    }

}
