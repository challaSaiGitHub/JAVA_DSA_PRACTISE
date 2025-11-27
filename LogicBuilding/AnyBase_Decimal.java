import java.util.Scanner;

public class AnyBase_Decimal {

    public static void AnyBase_Decimals(int basenumber)
    {
        
        int result=0;
        int p=0;
        while(basenumber>0)
        {
            int rem=basenumber%10;
            result=(int)(result+rem*Math.pow(2,p));
            p++;
            basenumber=basenumber/10;

        }
        System.out.println("AnyBase to decimal :"+result);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value");
        int base=sc.nextInt();
        AnyBase_Decimals(base);
        sc.close();
    }
    
}
