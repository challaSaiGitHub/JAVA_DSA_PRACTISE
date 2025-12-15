package BoitonicArrays;

public class MinimumElement {


    public static void main(String arg[])
    {
        int arr[]={2,4,5,9,11,7,2,1};

        System.out.println("The minimum element in Boitonic array is "+Math.min(arr[0], arr[arr.length-1]));
    }
    
}
