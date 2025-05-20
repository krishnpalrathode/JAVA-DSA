package collectionFrameworks;
import java.util.*;
public class itterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(40);
        al.add(89);
       // System.out.println(al);
        //for Loop
        for(int i=0;i<al.size();i++){
            Object o =al.get(i);
            System.out.println(o);
        }
        //for each
        for(Object o:al){
            System.out.println(o);
        }
    }
}
