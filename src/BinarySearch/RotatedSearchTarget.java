package BinarySearch;

public class RotatedSearchTarget {

   static int Search(int arr[] ,int target){
       int st =0;
       int end = arr.length-1;
       while (st<=end){
           int mid = st+(end-st)/2;
           if(arr[mid]==target){
               return mid;

           }
           else if(arr[mid]<arr[end]){ //mid to end is sorted
               if(target>arr[mid] && target<=arr[end]){
                   st = mid +1;
               }
               else{
                   end = mid -1;
               }
           }
           else{ //st to mid is sorted
               if(target<arr[mid]&& target>=arr[st]){
                   end = mid -1;
               }
               else{
                   st = mid +1;
               }
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        int arr[] = {0,1,1,2,2,2,2,3,0,0,0,0};
        int target = 3;
        int result = Search(arr,target);
        System.out.println("result"+result);


        }
    }

