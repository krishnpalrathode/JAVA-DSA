package BinarySearch;

import java.util.Scanner;



public class BSimplementation {
    static int  BinarySerch(int arr[],int target){
        int low= 0;
        int high = arr.length-1;

    //if mid == target return the index
        while(low<=high){
            int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]<target) {
            low=mid+1;
        }
        else {
            high=mid-1;
        }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {2,4,6,8,12,15,19,21,29,36,40};
        System.out.println("Enter the target element");
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();

       int result = BinarySerch(arr,target);
       if(result==-1){
           System.out.println("Element not found");
       }
       else{
           System.out.println("Element found at index "+result);
       }
    }
}
