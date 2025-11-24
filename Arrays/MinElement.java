package Arrays;

public class MinElement {
    
     public static void MinElement(int arr[])
    {
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum element in array is :"+min);
    }
    public static void main(String args[])
    {
              int arr[]={1,2,3,4,5,6,7,8,-2};
              MinElement(arr);
    }
}
