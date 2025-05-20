package Assignment._PW;
import java.util.*;

public class HighestElemnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enetr the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
   int val=0;
        for(int i=0;i<n;i++){
            if(arr[i]>val){
                val=arr[i];
            }

        }
        System.out.println(val);
    }
}