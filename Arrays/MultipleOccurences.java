package Arrays;

public class MultipleOccurences {
    
    public static void Occurences(int arr[],int target)
    {
        int ans[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
                  if(target==arr[i])
                  {
                    ans[k]=arr[i];
                    k++;
                  }
        }
        if(k == 0)
        {
            System.out.println("The target element is not found");
        }
        else
        {
            System.out.println("The target element is repeated for :"+k);
            for(int i=0;i<k;i++)
            {
                System.out.print(ans[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,3,4,5,6};
        Occurences(arr, 3);
    }
}
