package Arrays;

public class maxVAlue {
    public static void main(String[] args) {
     int[] arr = {100,1,3,9,7,6};
     int ans = 0;
     for(int i = 0; i < arr.length;i++){
         if(ans<arr[i]){
         ans = arr[i];
         }

     }
        System.out.println("max"+ans);

    }
}
