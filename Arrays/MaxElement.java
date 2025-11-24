package Arrays;

public class MaxElement {
    public static void MaxElement(int arr[])
    {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum element in array is :"+max);
    }
    public static void main(String args[])
    {
        int arr[]={10,20,40,70,89,100,101,-101,-809};
        MaxElement(arr);

    }
}
