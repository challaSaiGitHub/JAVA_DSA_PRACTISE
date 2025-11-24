package Arrays;

public class Linearsearch {

    public static void FirstOccurence(int arr[],int target)
    {
              for(int i=0;i<arr.length;i++)
              {
                if(arr[i]==target)
                {
                    System.out.println("The target element foun at index:"+i);
                    break;
                }
              }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,5,6,1,4,3};
        FirstOccurence(arr,5);
        
    }
    
}
