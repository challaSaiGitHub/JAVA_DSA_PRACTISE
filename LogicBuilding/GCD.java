import java.util.Scanner;

public class GCD {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        // System.out.println(min);
        sc.close();
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                System.out.println("GCD :" + min);
                break;
            }
            min--;
        }
        int max = (a > b) ? a : b;
        System.out.println("GCD :" + max);
    }
}
