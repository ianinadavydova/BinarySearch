package test.java;

import main.java.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void singleElementArray() {
        int[] arr = {1};
        assertEquals(0, BinarySearch.search(arr, 1));
        assertEquals(-1, BinarySearch.search(arr, -1));
        assertEquals(-1, BinarySearch.search(arr, 2));
    }

    @Test
    public void doubleElementArray() {
        int[] arr = {1, 3};
        assertEquals(0, BinarySearch.search(arr, 1));
        assertEquals(1, BinarySearch.search(arr, 3));
        assertEquals(-1, BinarySearch.search(arr, 2));
        assertEquals(-1, BinarySearch.search(arr, -1));
        assertEquals(-1, BinarySearch.search(arr, 5));
    }

    @Test
    public void hundredElementArray() {
        int[] arr = new int[64];
        for (int i = 0; i < 64; i++) {
            arr[i] = i;
        }
        assertEquals(0, BinarySearch.search(arr, 0));
        assertEquals(63, BinarySearch.search(arr, 63));
        assertEquals(32, BinarySearch.search(arr, 32));
        assertEquals(-1, BinarySearch.search(arr, -1));
        assertEquals(-1, BinarySearch.search(arr, 65));
    }
}
