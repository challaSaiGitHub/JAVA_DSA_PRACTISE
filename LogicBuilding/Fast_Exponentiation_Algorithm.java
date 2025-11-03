import java.util.Scanner;

public class Fast_Exponentiation_Algorithm {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number");
        int base=sc.nextInt();
        System.out.println("Enter the power");
        int power=sc.nextInt();
        int result=1;
        while(power>0)
        {
            if(power%2!=0)
            {
                result=result*base;

            }
            power=power/2;
            base=base*base;
        }
        System.out.println(result);
    }
    
}
