package BinarySearch;

public class RotatedSearch {


    /*
     * ye to hua liner search se
     * */
//    static int  LinerSearch(int arr[]){
//        int minidx=0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[minidx]>arr[i]){
//                minidx=i;
//
//            }
//        }
//        return minidx;
//
//    }

    static int BinarySearch(int[] arr){
        int n = arr.length;
        int st=0;
        int end  = n-1;

        int minidx = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[n-1]){
                st=mid+1;
            }
            else if(arr[mid]<arr[n-1]){
                minidx=mid;
                end=mid-1;
            }
        }
        return minidx;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,1,2};
     //   int minidx = LinerSearch(arr);
        //  System.out.println(minidx);
         int minidx = BinarySearch(arr);
        System.out.println(minidx);



    }


}
