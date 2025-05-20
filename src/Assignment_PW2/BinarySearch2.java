////Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
////        is not found in the array, report that as well.
////        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
////        target = 5
////        Output: Target 5 occurs 3 times
////        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
////        target = 6
////        Output: Target 6 occurs 2 times
//package Assignment_PW2;
//import java.util.*;
//
//public class BinarySearch2 {
//    public static int lastOcurrance(int arr[],int low,int high,int target){
//        int answer = -1;
//        while(low<=high){
//            int mid = low + (high-low)/2;
//
//            if(arr[mid]==target){
//                answer = mid;
//                low = mid+1;
//            }
//            else if(arr[mid]>target]){
//
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array");
//        int n = sc.nextInt();
//        System.out.println("Enter the array elements ");
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter the target element ");
//        int target = sc.nextInt();
//
//        int first = firstOcurrance(arr ,0,n-1,target);
//        int last = lastOcurrance(arr,0,n-1,target);
//
//
//    }
//}
//
