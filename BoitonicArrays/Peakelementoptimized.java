package BoitonicArrays;

public class Peakelementoptimized {
    

    public static void main(String args[])
    {
        int arr[]={2,4,5,9,11,7,2,1};
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid!=0 && mid!=arr.length-1 && arr[mid]>arr[mid-1] &&arr[mid]>arr[mid+1])
            {
                System.out.println("The peak element in array is :"+arr[mid]);
                break;
            }
            else if(arr[mid]<arr[mid+1])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            
        }

    }
}
