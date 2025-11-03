
import java.util.Scanner;

public class Decimal_AnyBase {

    public static void Decimal_AnyBase(int basenumber, int decimalnumber) {

        int result = 0;
        int p = 0;
        while (decimalnumber > 0) {

            int rem = decimalnumber % basenumber;
            decimalnumber = decimalnumber / basenumber;
            result = (int) (result + rem * Math.pow(10, p));
            p++;

        }
        System.out.println("Decimal to base" + basenumber + " :" + result);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base to convert");
        int anybase = sc.nextInt();
        System.out.println("Enter the decimal value");

        int decimalnumber = sc.nextInt();
        Decimal_AnyBase(anybase, decimalnumber);
    }
}