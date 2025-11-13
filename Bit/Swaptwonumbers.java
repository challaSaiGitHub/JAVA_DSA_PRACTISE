package Bit;

public class Swaptwonumbers {

    public static void main(String args[])
    { 
    int a=5,b=10;
    System.out.println("Before swaping  a="+a+" b="+b);
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("After swaping  a="+a+" b="+b);
    }
}
