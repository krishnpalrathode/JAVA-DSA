package SortingAlgoAPW;


public class MergeSort {
    static void display(int arr[],int n){
        for(int val:arr){
            System.out.println(val);
        }
    }
    static void Merge(int arr[],int l,int mid,int r){
        int i,j,k;
        i=l;
        j=mid+1;
        k=l;
        int n1= mid-i;
        int n2 = r-mid;
        if(arr[i]>arr[j]) {
            arr[k]=arr[j];
            j++;
            k++;
        }
        if(arr[j]>arr[i]){
            
        }
    }
    static void mergeSort(int arr[],int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        Merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        int[] arr ={3,5,2,4,1};
        int n = arr.length;
        System.out.println("array before Sorting ");
        display(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("array after sorting");
        display(arr,n);
    }
    }
