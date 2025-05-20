package DATA_STRUCTURE;
import java.util.*;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {

        int arr[]={19,76,13,56,2};

        insertionsort(arr);
        System.out.println("Sorted Array is");
        System.out.println(Arrays.toString(arr));
    }
}
