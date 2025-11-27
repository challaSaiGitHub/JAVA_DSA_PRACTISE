package Arrays;

public class BinarySearchInc {

    public static void BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (ans == -1) {
            System.out.println("Target Element not found ");
        } else {
            System.out.println("Target Elment " + target + " found ar index :" + ans);
        }
    }

    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 60;
        BinarySearch(arr, target);

    }

}
