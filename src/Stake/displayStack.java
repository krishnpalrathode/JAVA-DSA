package Stake;
import java.util.Stack;

public class displayStack {
    public static void displayrec(Stack<Integer> rt){
        if(rt.size()==0){
        //    System.out.print(st.pop());
            return;
        }
        else{
            int top = rt.pop();
//            System.out.print(st.pop()+" ");
            displayrec(rt);
            rt.push(top);
            System.out.print(top+" ");

        }

    }

        public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
            displayrec(st);

    }
}
