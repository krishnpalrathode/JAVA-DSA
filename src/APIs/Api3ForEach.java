package APIs;
import java.util.Arrays;
import java.util.*;

public class Api3ForEach {
    public static void main(String[] args) {
        List<Integer> list1 =new ArrayList<Integer>();
        list1.add(2);
        list1.add(5);
        list1.add(8);
        list1.add(9);
        list1.add(5);

        System.out.println(list1);
        List<Integer> list2 =Arrays.asList(2,4,5,8,9);
        System.out.println(list2);
//        for(Integer i:list2){
//            System.out.println(i);
//
//        }
        list2.forEach(n-> System.out.println(n));
    }
}
