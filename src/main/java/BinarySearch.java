package main.java;

public class BinarySearch {

    public static int search(int[] arr, int n) {
        int left = 0, right = arr.length;
        while (left < right) {
            int middle = (left + right) / 2;
            int m = arr[middle];
            if (n == m) {
                return middle;
            } else if (n < m) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
