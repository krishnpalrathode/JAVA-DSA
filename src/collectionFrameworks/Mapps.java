package collectionFrameworks;
import java.util.*;
public class Mapps {
    public static void main(String[] args) {
      HashMap hm = new HashMap();
      hm.put(01,"krishna");//Entry
      hm.put(02,"Singh");
      hm.put(03,"rajput");
        System.out.println(hm);

        LinkedHashMap hm2 = new LinkedHashMap();
        hm2.put(null,"virat");//Entry
        hm2.put(02,"Singh");
        hm2.put("ok","kholhi");
        System.out.println(hm2);
    }
}
