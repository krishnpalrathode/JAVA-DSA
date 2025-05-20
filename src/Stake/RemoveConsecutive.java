package Stake;
import java.util.*;
public class RemoveConsecutive {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (st.isEmpty() || st.peek() != arr[i])

                st.push(arr[i]);

            else if (arr[i] == st.peek()) {


                if (i == arr.length - 1 || arr[i] != arr[i + 1])
                    st.pop();
            }
        }
        int resultant[] = new int[st.size()];
        int m = resultant.length;
        for(int i=m-1;i>=0;i--){
            resultant[i]=st.pop();
        }
      return   resultant;
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,2,3,10,10,10,4,4,4,5,7,7,7,7,2};
        int[] resultant = remove(arr);
        for(int i=0;i<resultant.length;i++){
            System.out.println(resultant[i]+" ");
        }
    }
}
