package BinarySearch;

public class lasrOcurence {

    static int binarySearch(int arr[],int st,int end,int target){
        int lastOcuurence = -1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==target) {
                lastOcuurence=mid;
                st=mid+1;

            }
            else if(arr[mid]<target){
               st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return lastOcuurence;
    }

    public static void main(String[] args) {
        int  arr[] = {5,5,5,5,6,6,7,8,8,9};
        int target = 5;
        int st=0;
        int end=arr.length-1;

        int idx = binarySearch(arr,st,end,target);
        System.out.println(idx);
    }
}
