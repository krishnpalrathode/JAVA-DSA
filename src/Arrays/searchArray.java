package Arrays;

public class searchArray {
    public static void main(String[] args) {


        int[] arr = {2, 5, 6, 9, 8, 6};
        int x = 6;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== x){
                ans = i;
                break;
            }
        }
        System.out.println("found "+ x +"at index "+ans);

    }
}