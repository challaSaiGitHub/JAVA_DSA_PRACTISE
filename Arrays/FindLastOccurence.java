package Arrays;

public class FindLastOccurence {
    public static void LastOccurence(int arr[],int target)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                System.out.println("The last occurence of element in array is at :"+i);
                break;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,78,10,23,31};
        LastOccurence(arr,1);
    }
    
}
