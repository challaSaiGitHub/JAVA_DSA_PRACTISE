package Arrays;

public class AgnosticBInarysearch {

     public static void BinarySearchInc(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (ans == -1) {
            System.out.println("Target Element not found ");
        } else {
            System.out.println("Target Elment " + target + " found ar index :" + ans);
        }
    }

 public static void BinarySearchdec(int arr[],int target)
     {
        int start=0;
        int end=arr.length-1;
        int mid =0;
        int ans=-1;
        while(start <=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                break;
            }
            else if(arr[mid] >target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

           
        }
         if(ans ==-1)
            {
                System.out.println("Element not found");
            }
            else{
                System.out.println("Targer Element "+target+" foudn at :"+ans);
            }
     }
      
       public static void OrderAgnosticBinarySearch(int arr[],int target)
       {
        int start=0;
        int end=arr.length-1;

        if(arr[start]<=end)
        {
            BinarySearchInc(arr,target);
        }
        else
        {
            BinarySearchdec(arr, target);
        }

       }
    public static void main(String args[])
    {
                int arr[]={2,2,2,2,2,2,2};
                int target =2;
                OrderAgnosticBinarySearch(arr, target);

                int arr1[]={10,9,8,7,6,5,4};
                int target1=5;
                OrderAgnosticBinarySearch(arr1, target1);
    }
    
}
