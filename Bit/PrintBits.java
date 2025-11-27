package Bit;

import java.util.Scanner;

public class PrintBits {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print bits");
        int number=sc.nextInt();
        for(int i=7;i>=0;i--)
        {
            System.out.print((number>>i) &1);
        }
        sc.close();
    }
}
