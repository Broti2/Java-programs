import java.io.*;

class quicksort_mid {
    public static void quickSortWithRecursion(int low, int high, int[] work) {
        if (low >= high)
            return;

        int left = low, right = high;
        int pivot = work[(low + high) / 2];

        while (left <= right) {
            while (work[left] < pivot)
                left++;
            while (work[right] > pivot)
                right--;
            if (left > right)
                break;

            swap(left, right, work);
            left++;
            right--;
        }

        quickSortWithRecursion(low, right, work);
        quickSortWithRecursion(left, high, work);
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printarry(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 2, 8, 5, 4 };
        quickSortWithRecursion(0, arr.length - 1, arr);
        printarry(arr, arr.length);
    }
}