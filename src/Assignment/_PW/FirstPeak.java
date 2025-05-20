package Assignment._PW;
import java.util.*;
public class FirstPeak {
    public static int firstpeak(int arr[],int n){
        int value = -1;
        for (int i=1;i<arr.length-1;i++){
         if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                 value=i;
                 break;
            }

        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = firstpeak(arr,n);
        if(result== -1){
            System.out.println("peak element does not exixt");
        }
        else{
        System.out.println(arr[result]);
    }}
}
