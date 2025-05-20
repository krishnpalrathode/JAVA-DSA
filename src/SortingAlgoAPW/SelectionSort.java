package SortingAlgoAPW;

public class SelectionSort {
    public static void selectionsort(int arr[],int n){
    for(int i=0;i<n;i++){
        int min_idx=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_idx]);
            min_idx =j;
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    return;
    }
    public static void main(String[] args) {
        int arr[] ={23,5,34,59,2,1};
       int n = arr.length;
        selectionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
