import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number base ");
        int number=sc.nextInt();
         System.out.println("Enter the number power ");
        int power=sc.nextInt();
        int x=1;
        int result=1;
        while(x<power)
        {
            result=result*number;
            x++;

        }
        System.out.println(number+"Power"+power +"is" +":"+result);


    }
    
}
