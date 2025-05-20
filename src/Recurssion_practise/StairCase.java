package Recurssion_practise;
import java.util.*;
public class StairCase {
    public static int NoOfways(int n){
        if(n<=1){
            return n;
        }
        else{
            return NoOfways(n-1)+NoOfways(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stair to reach");
        int n = sc.nextInt();
        int result = NoOfways(n+1);
        System.out.println("The total no of ways to reach the stair are "+result);
    }
}
