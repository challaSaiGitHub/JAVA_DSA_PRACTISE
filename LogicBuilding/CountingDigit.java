import java.util.Scanner;

public class CountingDigit {

    public static void Optimize(int number)
    {
          int count=(int)(Math.log(number)/Math.log(10))+1;
          System.out.println("The number digits in a number is :" + count);
          
    }

    public static void main(String args[]) {
        Optimize(12);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count the number of digits");
        int number = sc.nextInt();
       

        int count = 0;
        while (number > 0) {

            count++;
            number = number / 10;
        }
        System.out.println("The number digits in a number is :" + count);
    }

}
