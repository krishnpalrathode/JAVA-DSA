package SortingAlgoAPW;

/* Given an integer array arr, move all 0's to the end of it while maintaining the
 relative order of the non-zero elements.

Note : Must do this in-place without making a copy of the array
 */

public class MoveZeroes {
    static void sortingArray(int arr[]){
       for(int j=0;j<arr.length;j++) {
           for (int i = 0; i < arr.length; i++) {
               while (i < arr.length - 1 && arr[i] == 0 && arr[i + 1] != 0) {
                   int tenp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = tenp;
               }
           }
       }
    }
    public static void main(String[] args) {
        int arr[]={0,5,0,0,0};
        sortingArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
