import java.util.Scanner;

public class Euclidian {

    public static void main(String args[]) {

        int a = 24;
        int b = 36;
        int result = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        result = a;
        if (a == 0) {
            result = b;
        }
        System.out.println("GCD :" + result);
    }
}
