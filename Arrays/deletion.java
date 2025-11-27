package Arrays;

public class deletion {

    public static void main(String args[])
    {
         int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4]=5;
        // int index=3; //wants to delete index 3
        System.out.println("Array elements before deletion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i=3;i<=arr.length-2;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println();
        System.out.println("Array elements After deletion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
