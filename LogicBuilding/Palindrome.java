import java.util.Scanner;

public class Palindrome {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Plaoindrome");
        int number=sc.nextInt();
        int copy=number;
        int result=0;
        while(number>0)
        {
            int rem=number%10;
            result=result*10+rem;
            number=number/10;
        }
        if(copy==result)
        {
            System.out.println("Given number is Palindrome");
        }
        else{
            System.out.println("Given number is not Palindrome");
        }

    }
    
}
