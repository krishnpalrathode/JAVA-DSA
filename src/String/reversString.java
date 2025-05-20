package String;

import java.sql.SQLOutput;
import java.util.*;
import java.lang.String;
public class reversString {
    public static void main(String args[]) {
        // CASE 1 pwjava --> avajwp
        String str1 = "pwjava";
        String str2 = " ";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);

        }
        System.out.println("before :" + str1);
        System.out.println("After :" + str2);


// CASE 2 PWSKILL JAVA --> JAVA PWSKILL

        String str3 = "pwskill java";
        String str4 = "";
        String sarr[] = str3.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            str4 = str4 + sarr[i] + " ";
        }

        System.out.println("Before :" + str3);
        System.out.println("After :" + str4);

        // CASE 3
        String str5 = "pwskill java";
        String str6 = "";

        for (int i = str5.length() - 1; i >= 0; i--) {
        str6 = str6 + str5.charAt(i);

        }
        System.out.println("Before :" + str5);
        System.out.println("After :" + str6);

        //   CASE 4

        String str7 = "PWSKILL JAVA";
        String str8 = "";

        String arr[] = str7.split(" ");

        for(String ele: arr){
            for(int i = ele.length()-1;i>=0;i--){
                str8 =str8+ele.charAt(i);

            }
            str8=str8+" ";
            System.out.println("before  :"+str7);
            System.out.println("After  :"+str8);
        }
    }
}