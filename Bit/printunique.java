package Bit;

public class printunique {
    public static void main(String args[])
    {
        int arr[]={2,4,2,6,3,3,1,1,6,4,98};
        int length=arr.length;
        int res=0;
        for(int i=0;i<length;i++)
        {
            res=res^arr[i];
        }
        System.out.println("Unique element in array is :"+res);
    }
    
}
