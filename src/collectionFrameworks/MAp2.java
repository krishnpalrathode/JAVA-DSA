package collectionFrameworks;
import java.util.Map;
import java.util.*;
public class MAp2 {
    public static void main(String[] args) {
    Map m1 = new HashMap();
    m1.put(1,"krishna");
    m1.put(2,"singh");
    m1.put(3,"rajput");
        System.out.println(m1);

        System.out.println(m1.get(1));
        System.out.println( m1.keySet());
        //we can not iterate the value in HasSet so we will use the Set to itterate the value
    Set keySet = m1.keySet();
    Iterator itr = keySet.iterator();
    while(itr.hasNext()){
      //  System.out.println(itr.next());
        Integer key =(Integer)itr.next();
        System.out.println(key);
    }
    Collection values=m1.values();
    Iterator itr2=values.iterator();
    while(itr2.hasNext()){
       // System.out.println(itr2.next());
        String key2 =(String)itr2.next();
        System.out.println(key2);
    }
    Set s1=m1.entrySet();
    Iterator itr3 =s1.iterator();
    while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
    }
}

