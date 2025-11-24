package Arrays;

public class FindLastOccurence {
    public static void LastOccurence(int arr[], int target, boolean val) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                if (val == false) {
                    break;
                }

            }
        }
        if(index == -1)
        {
               System.out.println("Given element not found");
        }
        else
        {
            System.out.println("Given element  found at index :"+index);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 78, 10, 23, 31, 10 };
        LastOccurence(arr, 10, true);
    }

}
