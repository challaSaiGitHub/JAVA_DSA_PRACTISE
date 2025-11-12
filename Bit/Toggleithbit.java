package Bit;

public class Toggleithbit {

    public static void printbits(int num)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
            int number=32;
            printbits(number);
            int bit=5;

            number=number^(1<<bit);
            
            printbits(number);
    }
    
}
