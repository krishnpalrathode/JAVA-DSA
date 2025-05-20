package String;
import java.util.*;
public class ReverseStringREVISION {
    public static void main(String[] args) {

        String str1=  "Krishna";
        String str2 = "";

        for(int i=str1.length()-1;i>0;i--){
            str2 = str2+str1.charAt(i);
        }
        System.out.println(str1);
        System.out.println(str2);
    }

}
