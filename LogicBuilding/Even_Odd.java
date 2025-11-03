import java.util.Scanner;

public class Even_Odd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numer to check number is even or odd");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Entered number is EVen");
        }
        else{
            System.out.println("Entered number is odd ");
        }
    }
    
}
