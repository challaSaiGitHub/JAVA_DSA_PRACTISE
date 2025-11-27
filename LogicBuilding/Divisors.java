import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer to find divisors");
        int number = sc.nextInt();
          sc.close();
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("Divisor of " + number + " is :" + i);

                int othernumber = number / i;
                if (othernumber != i) {
                    System.out.println("Divisor of " + number + " is :" + othernumber);

                }
            }

        }

    }

}
