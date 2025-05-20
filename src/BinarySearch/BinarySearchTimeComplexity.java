package BinarySearch;


import java.util.Arrays;
        import java.util.Random;

public class BinarySearchTimeComplexity {

    // Binary Search Algorithm
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Generate a sorted array of random numbers
    public static int[] generateSortedArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        Arrays.sort(arr);
        return arr;
    }

    // Measure execution time of binary search
    public static long measureTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        binarySearch(arr, target);
        return System.nanoTime() - startTime; // Time in nanoseconds
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000, 50000, 100000}; // Different array sizes

        System.out.println("Array Size\tExecution Time (ns)");
        for (int size : sizes) {
            int[] arr = generateSortedArray(size);
            int target = arr[arr.length / 2]; // Choosing the middle element for search
            long timeTaken = measureTime(arr, target);
            System.out.println(size + "\t\t" + timeTaken);
        }
    }
}

