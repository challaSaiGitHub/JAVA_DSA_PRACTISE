package BoitonicArrays;

public class Peakelement {
    

    public static void main(String args[])
    {
        int arr[]={2,4,5,9,11,7,2,1};
        int previous=0;
        int current=1;
        int next=2;
            
        while(next<arr.length-1)
        {
            if((arr[current]>arr[previous]) &&(arr[current]>arr[next]))
            {
                System.out.println("The peak element in array is with brueteforce:"+arr[current]);
                break;
            }
            else
            {
                previous++;
                current++;
                next++;
            }
           
        }
    }
}
