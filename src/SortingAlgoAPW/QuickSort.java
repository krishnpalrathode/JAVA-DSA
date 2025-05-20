package SortingAlgoAPW;

public class QuickSort {

    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
    static void Swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }
    static int partition(int arr[],int st,int end){
    int pivot = arr[st];
    int count = 0;
    for(int i=st+1;i<=end;i++){
        if(arr[i]<=  pivot) count++;
    }
    int pivotIndex=st+count;
    Swap(arr,st,pivotIndex);


    int i=st;
    int j=end;

    //element lesser left ,greater --> rigth side of pivot
    while(i<pivotIndex && j>pivotIndex) {
        while (arr[i] <= pivot)
            i++;
        while (arr[j] > pivot)
            j--;
        if (i < pivotIndex && j > pivotIndex) {
            Swap(arr, i, j);
            i++;
            j--;
        }
    }
      return pivotIndex;
    }
    static void quickSort(int[] arr,int st,int end){
    if(st>=end) return;
    int pi = partition(arr,st,end);
    quickSort(arr,st,pi-1);
    quickSort(arr,pi+1,end);
    }

    public static void main(String args[]) {
      int arr[] = {6,3,1,5,4};
        System.out.println("Arr before sorting");
       display(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        display(arr);
    }
}
