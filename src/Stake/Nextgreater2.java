package Stake;
import java.util.Stack;
import java.util.*;

public class Nextgreater2 {
    public static void main(String[] args) {
        int arr[] = {1,5,2,1,8,6,3,4};
        int res[] = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1]= -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
            }

            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]= st.peek();

            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}