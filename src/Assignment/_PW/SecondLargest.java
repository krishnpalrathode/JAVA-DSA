package Assignment._PW;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        System.out.println("Enter the element if the array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int value=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>value){
                value=arr[i];
            }
            
        }
        System.out.println(value);

    }
}
