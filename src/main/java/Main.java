import main.java.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * 2;
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(BinarySearch.search(arr, 0));
    }
}
