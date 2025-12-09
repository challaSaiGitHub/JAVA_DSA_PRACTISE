package Arrays;

public class Mad {

    public static void minimumDifference(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int index=-1;
        int mindiff=-1;
        int ans=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;

            if(nums[mid]==target)
            {
                mindiff=nums[mid];
                index=mid;
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
        

        
        if(index==-1)
        {
             if(end==-1)
            {
                          ans=Math.abs(target-nums[start]); //floor
            }
            else if(start ==nums.length)
            {
                ans=Math.abs(target-nums[end]); //ceil
            }
            else
            {
         int abs1=Math.abs(target-nums[start]); //ceil
        int abs2=Math.abs(target-nums[end]);//floor
        System.out.println("The absolute Minimum difference :"+Math.min(abs1, abs2));
            }
            
           System.out.println("The minimums difference is :"+ans);
        
       
        }
        else
        {
            System.out.println("found");
            System.out.println("The absolute minimum difference is :"+(target-mindiff));
        }

    }

    public static void main(String args[])
    {
        int arr[]={2,2,4,5,7,9,25,56,88,94};
        int target=100;
        minimumDifference(arr, target);
        
    }
    
}
