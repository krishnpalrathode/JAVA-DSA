package DATA_STRUCTURE;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class LowerBound {
    public static int binarySearch(int arr[] , int target){
     int low=0,high=arr.length-1;
     int result = -1;
     while(low<=high) {
         int mid = low + (high-low)/2;
         if(arr[mid]==target){
             result =mid;
             high=mid-1;
         }
         else if(arr[mid]<target){
             low=mid+1;
     }
     else{
         high=mid-1;
         }
     }
     return result;
     }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int x = sc.nextInt();
        int result = binarySearch(arr,x);
        if(result==-1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element found at index "+result);
        }

    }
}
