package Bit;

public class unsetrightmostbits {

    public static void printbits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void Noofsetbits(int num1)

    {
        int count = 0;

        while (num1 != 0) {
            count++;
            num1 = unsetrightmostbit(num1);

        }
        System.out.println(count);
    }

    public static int unsetrightmostbit(int num) {
        return num & num - 1;
    }

    public static void main(String args[]) {
        int number = 32;
        Noofsetbits(number);
        System.out.println("Before unset");
        printbits(number);

        number = number & number - 1;
        System.out.println("After unset");
        printbits(number);

    }

}