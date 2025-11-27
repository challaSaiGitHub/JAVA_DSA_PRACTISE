import java.util.Scanner;

public class TrailingZeros {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find zeros");
               int number=sc.nextInt();
               int result=0;
                sc.close();
        for(int i=5;i<=number;i=i*i)
        {
                    result=result+number/i;
        }
        System.out.println("Number of zeros in 30 factorial is :"+result);
    }

    
}
