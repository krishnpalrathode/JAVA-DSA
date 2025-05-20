package SprintOne;
import java.util.*;
//Identifying Palindromes
//        Difficulty: Easy
//        Topics: Basic Programming, String Manipulation
//        Description: Write a program to check if a string or number is a palindrome.
//        Example:
//        Input: string = "radar"
//        Output: Palindrome
//        Explanation: "radar" reads the same backward as forward.
public class PalindromCheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ..");
        String s1 = sc.nextLine();
        String rev ="";
        int len = s1.length();
        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println(s1+"  rais a palindrom string");
        }
      else{
            System.out.println("Not a palondrom");
        }

    }
}
