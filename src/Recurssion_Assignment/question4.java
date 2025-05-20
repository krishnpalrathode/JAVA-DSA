//: Find the sum of the values of the array [92, 23, 15, -20, 10].
package Recurssion_Assignment;
import java.util.*;
public class question4 {
    public static int SumOfarray(int arr[],int i,int Sum) {
        if (i > arr.length) {
            return 0;
        }
          if(i>0) {
              SumOfarray(arr, i + 1, Sum );
              Sum = Sum + i;
              
          }
        return Sum;

    }
    public static void main(String[] args) {

        System.out.println("the sum of elements are ");
        int arr[] = {92,23,15,-21,10};
        int Sum =0;
        int result = SumOfarray(arr,0,Sum);
        System.out.println(result);
    }
}
