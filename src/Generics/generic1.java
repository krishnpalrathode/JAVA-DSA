package Generics;
import java.util.*;
public class generic1 {
    public static void main(String[] args) {
        //typesafety
        String ar[]=new String[10];
        ar[0]="Krishna";
        ar[1]="ppw";
        //ar[2]=10; compile time  error

        String neme1=ar[0];
        String name2=ar[1];

        //No TypeSafety
//        ArrayList al = new ArrayList();
//        al.add("krishna");
//        al.add("pw");
//        al.add(10);
//
//        String n1=(String)al.get(0);
//        String n2=(String)al.get(1);
//        String n3=(String)al.get(2);

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Krishna");
        al1.add("PW");
      // al1.add(10);// will not accept at complie time only
        String nam1=al1.get(0);
     String nam2 = al1.get(1);


    }
}
