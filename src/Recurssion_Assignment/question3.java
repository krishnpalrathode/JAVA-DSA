//Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
package Recurssion_Assignment;
import java.util.*;

public class question3 {
    public static int maxelement(int arr[],int n,int max){
        if(n==arr.length){
            return max;
        }
        if(arr[n]>max){
          max=arr[n];
        }
        return maxelement(arr,n+1,max);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int arr[] = {13,1,-3,22,5};
        int max = Integer.MIN_VALUE;
        int result = maxelement(arr,0,max);
        System.out.println("maximum of the array is  "+result);
        


    }
}
