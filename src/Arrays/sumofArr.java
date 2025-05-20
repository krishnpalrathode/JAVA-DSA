package Arrays;

public class sumofArr {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3,4,6,9,0,7};
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);

    }
}