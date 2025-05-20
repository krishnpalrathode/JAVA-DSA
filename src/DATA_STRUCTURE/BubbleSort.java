package DATA_STRUCTURE;
import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[],int n){
            Boolean Swapped=false;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if (arr[j]>arr[j+1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        Swapped =true;
                    }
                }
                if(!Swapped){
                    break;
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the array element");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println("Sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
