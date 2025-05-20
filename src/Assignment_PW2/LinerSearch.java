//Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
//        else print “Element not found in array”. Input the size of array, array from user and the element X from user.
//        Use Linear Search to find the element.

package Assignment_PW2;
import java.util.*;
public class LinerSearch {
    public static int linerSearch1(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int result = linerSearch1(arr,num);
        if(result==-1) {
            System.out.println("Element not found  " );
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }
}
