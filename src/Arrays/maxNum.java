package Arrays;

public class maxNum {
    public static void main(String[] args) {


         int[] arr = {1,4,5,7,8,6};

         int ans = 0;

     for(int i = 0;i<arr.length;i++){
         if(arr[i]>ans)
         {
             ans = arr[i];
         }

     }
         System.out.println("max" +ans);

     }

}
