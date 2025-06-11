package String;

import java.util.Scanner;

public class ExpandString {

    public static StringBuffer expandedString(String str){
        StringBuffer output = new StringBuffer();
        int i,j,k;
        for(i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int n = ch-'0';
            StringBuffer temp=new StringBuffer();

            for(j=i+2;str.charAt(j)!=')';j++){
                temp.append(str.charAt(j));
            }
            for(k=1;k<=n;k++){
                output.append(temp);
            }
            i=j;
        }
        return output;
    }
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer result=expandedString(input);
        System.out.println(result);
    }
}
