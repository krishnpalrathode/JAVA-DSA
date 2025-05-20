package Recurssion_practise;
import java.util.*;

public class Binarysearch {
    public static int ReccursiveSearch(int arr[],int target, int low,int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return ReccursiveSearch(arr, target, low, mid - 1);
            } else {
                return ReccursiveSearch(arr, target, mid + 1, high);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the sorted array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int low =0;
        int high = n-1;

       int result = ReccursiveSearch(arr,target,low,high);
        System.out.println(result);
    }
}
