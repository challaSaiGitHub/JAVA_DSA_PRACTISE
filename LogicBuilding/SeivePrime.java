import java.util.Arrays;
import java.util.Scanner;

public class SeivePrime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int range = sc.nextInt();
        sc.close();
        boolean arr[] = new boolean[range + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i <= range; i++) {
            if (arr[i] == true) {
                for (int factor = i + i; factor <= range; factor += i) {
                    arr[factor] = false;
                }
            }
        }

        for (int i = 2; i <= range; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

}
