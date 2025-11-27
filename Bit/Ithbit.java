package Bit;

import java.util.Scanner;

public class Ithbit {

    public static void printbits(int num)
    {
              for(int i=7;i>=0;i--)
              {
                System.out.print((num>>i)&1);
              }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        printbits(number);
        System.out.println();
        int bit=0;
        int bits=(number) & (1<<bit);
        System.out.println(bits);
        if(bits==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
        sc.close();

    }
    
}
