//Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
//        That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
//        Constraints : 0<=n<=1e6
//        Input1 : n = 10
//        Output 1 : -5
//        Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
//        Input 2 : n = 5
//        Output 2 : 3

package Recurssion_Assignment;
import java.util.*;

public class question2 {
    public static int SumOfdigits(int n,int i){
        int result = 0;
        if(i==n+1){
            return 0;
        }
        if(i%2==0){
            return -i+SumOfdigits(n,i+1);
        }
        else{
            return i+SumOfdigits(n,i+1);
        }

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i = 0;
        int finalresult = SumOfdigits(n,i);
        System.out.println(finalresult);

    }
}
