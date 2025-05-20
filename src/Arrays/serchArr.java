package Arrays;

public class serchArr {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,5,8,9};
        int ele = 5;
        int ans = -1;
        for(int i = 0; i<=arr.length;i++){
           if(arr [ i ]==ele) {
               ans = i;
               System.out.println("Found"+ ele +"at index" + ans );
           }

        }

    }
}
