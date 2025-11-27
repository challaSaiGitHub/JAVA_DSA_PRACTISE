package Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        int arr[] = { 87,54,36,22,18,1 };

        int target = 1;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("The element " + target + " found at index :" + mid);
                break;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
