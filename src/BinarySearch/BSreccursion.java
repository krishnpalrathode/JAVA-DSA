package BinarySearch;

import java.util.Scanner;

public class BSreccursion {

    static boolean binarySreach(int arr[], int st, int end,int target) {

        if(st>end) return false;
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] > target) {
              return  binarySreach(arr, st, mid - 1, target);
            } else {
              return  binarySreach(arr, mid + 1, end, target);
            }

        }


    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 12, 15, 19, 21, 29, 36, 40};
        System.out.println("Enter the target element");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        binarySreach(arr, 0, arr.length - 1,target);
        System.out.println(binarySreach(arr, 0, arr.length - 1,target));
    }
}