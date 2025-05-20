package Recurssion_practise;
import java.util.*;

public class FindingPower2 {
    public static long PowerOfelement(int a,int b){
        if(b==1){
            return a;
        }
        else {
            long result = PowerOfelement(a, b / 2);
            long finalresult = result * result;
            if (b % 2 == 0) {
                return finalresult;
            }
            else {
                return finalresult * a;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        long final_result = PowerOfelement(a,b);
        System.out.println("The final result is "+final_result);
    }
}
