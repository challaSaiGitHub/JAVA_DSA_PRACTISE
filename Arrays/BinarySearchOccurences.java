package Arrays;

public class BinarySearchOccurences {

    public static int binarysearch(int arr[],int target,boolean isFirst)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int index=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                index=mid;
                if(isFirst)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }

    public static void main(String args[])
    {
              int arr1[]={2,2,2,4,4,5,5,5,5,5,5,8,9,7,90};
              int target=5;
              int res[]=new int[2];
              int first=binarysearch(arr1, target, true);
              int last=binarysearch(arr1, target, false);
              System.out.println("The occurences of target element is "+(last-first+1));
              res[0]=first;
              res[1]=last;
              System.out.println("The first occurence of target element is at index :"+res[0]);
              System.out.println("The last occurence of target element is at index :"+res[1]);
    }
    
}
