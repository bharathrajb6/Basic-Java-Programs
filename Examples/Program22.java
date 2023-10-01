package Examples;

//average of the numbers.
public class Program22 {
    public static void main(String[] args) {
        int a1[] = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i : a1) {
            sum += i;
        }
        float avg = sum / a1.length;
        System.out.println("Average : " + avg);
    }
}
