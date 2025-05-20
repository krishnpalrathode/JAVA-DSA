//Brute force approach
//time complexity O(b)
package Recurssion_practise;
import java.util.*;
public class FindingPower {
    public static int Powerofelement(int a,int b){
       if(b==1){
           return a;
       }
       else {
           int result = a * Powerofelement(a, b - 1);

           return result;
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int finalresult = Powerofelement(a,b);
        System.out.println("The result is  "+finalresult);

    }
}
