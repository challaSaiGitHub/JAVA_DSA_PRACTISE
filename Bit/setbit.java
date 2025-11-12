package Bit;

public class setbit {
    
    public static void printbits(int num)
    {
        for(int i=7;i>=0;i--)
        {
            System.out.print(num>>i &1);
        }
    }
    public static void main(String args[])
    {
        int number=32;  //100000
        System.out.println("Before setting the bit");
        printbits(number);
        int bit=2;
        number=(number |1<<(bit));
        System.out.println();
        System.out.println("After setting the bit");
        printbits(number);
        
    }
}
