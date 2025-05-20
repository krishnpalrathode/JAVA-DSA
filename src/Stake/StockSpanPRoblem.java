package Stake;
import java.util.Arrays;
import java.util.Stack;
public class StockSpanPRoblem {
    public static void main(String[] args) {
        int arr[]=  {100,80,60,70,60,75,85};
        int result[]= new int[arr.length];

        Stack<Integer> st = new Stack();
        st.push(0);
        result[0]=1; 
        for(int i=1;i<=arr.length-1;i++){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) result[i] = i-0;
            else{
                result[i]=i-st.peek();

            }
            st.push(i);
        }
        System.out.println(Arrays.toString(result));

    }
}
