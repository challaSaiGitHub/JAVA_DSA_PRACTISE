package BoitonicArrays;

public class ValidateBoitonic {

    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 9,11,7, 2, 1,10 };

        int index = 0;
        int n = arr.length - 1;
        while (index < n) {
            if (arr[index] < arr[index + 1]) {
                index++;
            } else {
                break;
            }
        }

        if (index == 0 | index == n) {
            System.out.println("Not Boitonic");
        } else {
            while (index < n) {
                if (arr[index] > arr[index + 1]) {
                    index++;
                } else {
                    break;
                }
            }
            System.out.println(index);
            if(index==n)
            {
                System.out.println("Array is boitonic");
            }
            else
            {
                System.out.println("Not a boitonic");
            }
        }
    }
}
