import java.util.Scanner;

public class Primenumbersrange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which number you need prime numbers");
        int range = sc.nextInt();

        for (int i = 2; i <= range; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((int) i % j == 0) {

                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Prime number :" + i);
            }
        }

    }
}
