package DATA_STRUCTURE;
import java.util.*;
public class SquareRoot{
    public static int squareroot(int num){
        int low =0,high=num-1,result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int value =mid*mid;
            if(value==num){
               return mid;
            }
            else if(value>num){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square root to find");
        int num = sc.nextInt();

        int result = squareroot(num);
        System.out.println("THe square root of number is  "+result);
    }
}