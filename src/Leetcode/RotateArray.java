package Leetcode;

public class RotateArray {

    public static void rotate(int[] arr,int k){
        int n = arr.length;
        int[] temp= new int[n];
        for(int i=0;i<k;i++){
            temp[i]=arr[n-1];
        }
        
        for(int j=0;j<n;j++){
            System.out.print(temp[j]+" ");
        }
        return;
    }


    public static void main(String[] args) {
        int k = 3;
        //input
        int[] arr =   {1,2,3,4,5,6,7};

        rotate(arr,k);
        }
}
