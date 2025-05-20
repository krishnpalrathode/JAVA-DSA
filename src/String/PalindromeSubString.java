package String;
import java.util.*;

public class PalindromeSubString {

    static boolean Ispalindrom(String ans) {
        int left = 0, right = ans.length() - 1;

        while (left < right) {
            if (ans.charAt(left) != ans.charAt(right)) {
                return false; // If mismatch found, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If no mismatch, it's a palindrome
    }

    public static void main(String[] args) {
        int count=0;
        String str = "abcd";
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<=sb.length();j++){
                String  ans = sb.substring(i,j);
                System.out.println(ans);
                boolean result = Ispalindrom(ans);

                if(result){
                    count++;
                }


            }
        }
        System.out.println(count);
    }
}
