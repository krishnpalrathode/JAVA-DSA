package APIs;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.*;
public class Stream1 {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,9,5,8,7,6);

        Stream<Integer> StreamData = list.stream();
        Stream<Integer> FinalData=StreamData.
                filter(n->n%2==0)
                .sorted().map(n->n*2);
//        Stream<Integer> sortedData = FilterData.sorted();
//        Stream<Integer> mapStream=sortedData.map(n->n*2);

        FinalData.forEach(n -> System.out.println(n));
    }
}