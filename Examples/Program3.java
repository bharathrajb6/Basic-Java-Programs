package Examples;

//Find the ASCII value of a character
public class Program3 {
     public static void main(String a[]){
        char val1 = 'a';
        int asciiValue = val1;
        System.out.println("ASCII of " + val1 + " is " + asciiValue);

        //another way is type-casting
        int asciiValue1 = (int) val1;
        System.out.println("ASCII of " + val1 + " is " + asciiValue1);
     }
}
