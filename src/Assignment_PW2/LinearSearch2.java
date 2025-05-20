//Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
//        not present return -1.
//        Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
//        Output 1: 6
//        Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
//        Output 2: -1
package Assignment_PW2;
import java.util.*;
public class LinearSearch2 {
    public static int lastOccurance(int arr[], int target, int n)
    {


            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] == target) {

                    return i;
                }

            }


        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element ");
        int target = sc.nextInt();

        int result = lastOccurance(arr, target, n);
        if (result == -1) {
            System.out.println("Element not found" + result);
        } else {
            System.out.println("Elemnet found at index " + result);
        }

        sc.close();
    }
}





