package Arrays;

public class BInarysearchFirtandlast {

    public static void Binarysearch(int arr[],int target,boolean isFirst)
    {
              int start=0;
              int end=arr.length-1;
              int mid=0;
              int index=-1;

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
                else if(arr[mid]< target)
                {
                           start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
              }
              if(index == -1)
              {
                         System.out.println("Element not found");
              }
              else{
                          System.out.println("The last occurenec of Element found at index "+index);
              }

    }
    
    public static void main(String args[])
    {
        int arr[]={2,2,4,4,4,8,12,16,16};
         int target=16;
         Binarysearch(arr, target,false);
    }
}
