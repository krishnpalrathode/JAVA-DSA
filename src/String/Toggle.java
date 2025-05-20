package String;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        //PHysiCs --> phYSIcS
        for(int i=0;i<=str.length()-1;i++){
           //P -> p
           // cheak -> alphabet- small ,capital
            boolean flag = true; // true Capital
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=97) flag = false; //small
            if(flag==true){
             asci += 32;
             char dh = (char)asci;
             str.setCharAt(i,dh);
            }
            else{
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }

//    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("phySICS");
//        for(int i=0;i<str.length();i++){
//            int ascii= (int)str.charAt(i);
//            if(str.charAt(i)<97){
//                ascii = ascii+32;
//                char ch =(char)ascii;
//                str.setCharAt(i,ch);
//            }
//            else{
//               ascii = ascii-32;
//                char ch =(char)ascii;
//                str.setCharAt(i,ch);
//
//            }
//        }
//        System.out.println(str);
//    }
}
