package Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 99 };

        int target = 60;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("The element " + target + " found at index :" + mid);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
