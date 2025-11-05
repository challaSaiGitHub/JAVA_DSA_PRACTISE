import java.util.Scanner;

public class Primenumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the number is prime or not");
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            System.out.println(i);
            if (number % 2 == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

}
