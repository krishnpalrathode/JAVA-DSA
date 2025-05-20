package DATA_STRUCTURE;
import java.util.*;
import java.io.*;


public class BinarySearch {
    public static int binarySearch(int[] arr,int target) {
        int low =0,high=arr.length-1;

        while(low<high){
        int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;

        }
            else if(arr[mid]<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            }
        return 0;
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elemnet of the array");
            // Taking array as the input
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            System.out.println("Enter the element to search the array");
            int x = sc.nextInt();

            int result = binarySearch(arr,x);
            if (result==0){
                System.out.println("The target element not found ");

        }
            else{
                System.out.println("Target element found at ind"+result);
            }
        }
    }
}
