package Arrays;

public class Ceil {
     public static void ceil(int arr[],int target)
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
                
                start=mid+1;
            }
            else
            {
                ans=arr[mid];
                 end=mid-1;
            }
        }
        System.out.println("The ceil value of target element is :"+ans);
    
}


 public static void main(String args[])
    {
            int arr[]={1,2,3,4,5,6,7,9};
            int target=8;
            ceil(arr, target);
    }
}

