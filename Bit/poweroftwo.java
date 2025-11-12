package Bit;

public class poweroftwo {


    public static void main(String args[])
    {
        int number=31;
        number=number &number-1;
        if(number==0)
        {
            System.out.println("Power of 2");
        }
        else
        {
            System.out.println("Not power of 2");
        }
    }
    
}
