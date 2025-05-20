package DATA_STRUCTURE;
import java.util.*;
public class Array1D_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        int sum =0;
        for(int j=0;j<arr.length;j++){
          sum+=arr[j];
          j++;
        }
        System.out.println(sum);
    }
}
