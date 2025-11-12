package Bit;

public class unsetithbit {

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
              int bit=0;
              System.out.println("Before unset");
              printbits(number);
              number=(number &~(1<<bit));
              System.out.println("After unset");
              printbits(number);
    }
    
}
