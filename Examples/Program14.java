package Examples;

import java.util.Scanner;

//Fibonacci Series
public class Program14 {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();
        scan.close();
        int first=0,second=1;

        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
