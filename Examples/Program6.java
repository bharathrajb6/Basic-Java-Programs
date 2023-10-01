package Examples;

import java.util.Scanner;

public class Program6 {
    
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = scan.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is an vowel.");
        }
        scan.close();
    }
}
