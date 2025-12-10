package Arrays;

public class Infiniteseries {

    public static int[] range(int nums[],int target)
    {
            int range[]=new int[2];
              int start=0;
              int end=1;
              while(target>=nums[end])
              {
                start=end;
                end=2*end;
              }
              range[0]=start;
              range[1]=end;
            return range;
    }

    public static void binarysearch(int nums[],int target,int start,int end)
    {
              int mid=0;
              int ans=-1;
              while(start<=end)
              {
                mid=start+(end-start)/2;
                if(nums[mid]==target)
                {
                    ans=mid;
                    break;
                }
                else if(nums[mid]<target)
                {
                    start=mid+1;
                }
                else 
                {
                    end=mid-1;
                }
              }
              if(ans==-1)
              {
                System.out.println("Element not found");
              }
              else
              {
                System.out.println("ELement found at :"+ans);
              }
    }
    public static void main(String args[])
    {
             int arr[]={2,2,4,5,7,9,25,56,88,94};
             int target=25;
            int ra[]= range(arr, target);
            System.out.println("Start :"+ra[0]+","+"End :"+ra[1]);
            binarysearch(arr, target, ra[0], ra[1]);
    }
    
}
