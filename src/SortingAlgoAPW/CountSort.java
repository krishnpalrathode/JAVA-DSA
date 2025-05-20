package SortingAlgoAPW;

public class CountSort {

    static void display(int arr[]){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }

    static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

   static void basicCountSort(int[] arr){
       // find the largest element of the arr
       int max = findmax(arr);


       int count[] = new int[max+1];
       for(int i=0;i<arr.length;i++){
          if(arr[i]==i){
              count[arr[i]]++;
          }
       }
   }
   public static void main(String[] args) {
        int[] arr ={1,4,5,2,2,5};
        basicCountSort(arr);
        display(arr);

    }
}
