package Revision_DataStructure;
import java.util.*;

public class Missing_Number_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of the array");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
       // System.out.println("the sum of n number is");
        int Total_Sum = ((n+1)*(n+2))/2;
        int result = Total_Sum - sum;
        System.out.println("The missing element of the array is  "+result);
    }
}

