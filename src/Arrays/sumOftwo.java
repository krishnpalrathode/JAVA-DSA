package Arrays;

public class sumOftwo {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i]; //sum += arr[i]

        }
        System.out.println(sum);
    }
}
