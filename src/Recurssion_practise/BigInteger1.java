package Recurssion_practise;
import java.util.*;
import java.math.*;
public class BigInteger1 {
    public static BigInteger Powerofelement(BigInteger a,int b){
        BigInteger result , finalresult ;
        if(b==1){
            return a;
        }
        else{
            result = Powerofelement(a,b/2);
            finalresult = result.multiply(result);
            if(b%2==0){
                return finalresult;
            }
            else{
                return a.multiply(finalresult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        BigInteger finalresult = Powerofelement(a,b);
        System.out.println(finalresult);
    }
}
