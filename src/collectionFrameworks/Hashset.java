package collectionFrameworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("Deepak");
        al.add("Rajput");
        al.add(2);


        HashSet hs = new HashSet();
        hs.add(10);
        hs.addAll(al);
        hs.add("deepak");
        hs.add(100.55);
        //hs.clear();
        hs.add("deepak");
        hs.add(null);
       // System.out.println(hs.contains("deepak"));
        
        System.out.println(hs);
       Iterator itr = hs.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}