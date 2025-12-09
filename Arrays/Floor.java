package Arrays;

public class Floor {

    public static void floor(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int ans=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
              ans=arr[mid];
              break;
            }
            else if(arr[mid]<target)
            {
                ans=arr[mid];
                start=mid+1;
            }
            else
            {
                 end=mid-1;
            }
        }

        System.out.println("The floor of target element is :"+ans);
    }
    public static void main(String args[])
    {
            int arr[]={1,2,4,5,6,7,9};
            int target=3;
            floor(arr, target);
    }
    
}
