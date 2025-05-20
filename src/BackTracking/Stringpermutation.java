package BackTracking;
import java.util.*;
public class Stringpermutation {
    public static  String swap(String str,int i,int j){
        char temp ;
        char[] charArray = str.toCharArray();
         temp=charArray[i];
         charArray[i]=charArray[j];
         charArray[j]=temp;

         return String.valueOf(charArray);

    }
    public static void combination(String s,int l,int r ){
        if(l==r){
            System.out.println(s);
        }
        else{
            for(int i=0;i<=r;i++){
              s =  swap(s,l,i);
              combination(s,l+1,r);
              // backtracking
              s = swap(s,l,i);
            }

        }
    }
    public static void main(String[] args) {
      String s = "ABC";

      int l = 0;
      int r = s.length()-1;
      combination(s,l,r);
    }
}
