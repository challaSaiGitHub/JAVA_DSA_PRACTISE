package Arrays;

public class BinarySearchdec {

     public static void BinarySearch(int arr[],int target)
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
    public static void main(String args[])
    {
               int arr[]={10,9,8,7,6,5,4,3,2,1};
               int target=7;
               BinarySearch(arr,target);
    }
    
}
