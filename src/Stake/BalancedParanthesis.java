package Stake;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);

            }
            else{
                if(st.isEmpty())
                return false;
                else{
                int top = '(';
                st.pop();
                }
            }
        }
        if(st.size()==0) return true;
        else return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
    String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
}

