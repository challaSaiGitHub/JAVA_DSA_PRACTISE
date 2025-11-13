package Bit;

public class ClearLSB {

    public static void printbits(int num)
    {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int num = 53;
        printbits(num);
      
        int bit=4;
        num=num & ~(1<<bit+1)-1;
        printbits(num);
    }

}
