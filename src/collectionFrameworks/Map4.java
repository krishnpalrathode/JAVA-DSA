package collectionFrameworks;
import java.util.*;
import java.util.Map.*;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Jadeja");
        ht.put(2, "Dhoni");
        //   ht.put(3,"virat");
// HashTable does not allows null values
        ht.putIfAbsent(3, "Rahul");
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(3,"Sachin");
        tm.put(2,"Blaster");
        tm.put(1,"Master");

        System.out.println(tm);

    }
}