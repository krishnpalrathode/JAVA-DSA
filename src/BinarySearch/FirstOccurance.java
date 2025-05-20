package BinarySearch;

public class FirstOccurance {

    static int binarySearch(int arr[],int st,int end,int target){
        int firstOcurrance = -1;
       while(st<=end){
           int mid = st+(end-st)/2;
           if(arr[mid]==target){
               firstOcurrance=mid;
               end=mid-1;
           } else if (arr[mid]>target) {
               end=mid-1;
           }
           else{
               st=mid+1;
           }
       }
    return firstOcurrance;

    }
    public static void main(String[] args) {
        int  arr[] = {5,5,5,5,6,6,7,8,8,9};
        int target = 9;
        int st=0;
        int end=arr.length-1;

        int idx = binarySearch(arr,st,end,target);
        System.out.println(idx);
    }
}
