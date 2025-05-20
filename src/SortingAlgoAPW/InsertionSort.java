package SortingAlgoAPW;
import java.util.Scanner;
public class InsertionSort {
    static void Insertionsort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,3,5,4,9,6};
        Insertionsort(arr);
        for(int i: arr ){
            System.out.println(i+" ");
        }
    }
}

