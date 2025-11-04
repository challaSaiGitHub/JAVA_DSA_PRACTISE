public class ArmstrongNumber {

    public static int count(int number) {
        int count = (int) (Math.log(number) / Math.log(10)) + 1;
        return count;
    }

    public static void main(String args[]) {
        int number = 1634;
        int copy = number;
        int numberofdigits = count(1634);
        System.out.println(numberofdigits);

        double result = 0;
        while (number > 0) {
            int rem = number % 10;
            result = (result + Math.pow(rem, numberofdigits));

            number = number / 10;
        }

        if (copy == result) {
            System.out.println("Number is Armstrong number");
        } else {
            System.out.println("Number is not a Armstrong number");
        }

    }

}
