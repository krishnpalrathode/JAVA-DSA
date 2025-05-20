//Q1 : Given an integer, find out the sum of its digits using recursion.
//        Input: n= 1234
//        Output: 10
//        Explanation: 1+2+3+4=10

package Recurssion_Assignment;
import java.util.*;
public class question1 {
    public static int Sumofdigits(int n){
        if(n<10){
            return n;
        }
        else {
            return n%10+Sumofdigits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int result = Sumofdigits(n);
        System.out.println(result);
    }
}
