package collectionFrameworks;
import java.util.TreeSet;
public class treeset
{
    public static void main(String[] args)
    {
      TreeSet ts = new TreeSet();
      ts.add(100);
      ts.add(50);
      ts.add(150);
      ts.add(25);
      ts.add(75);
      ts.add(125);
      ts.add(175);
        System.out.println(ts);       //order of insertion is not preserved here as its was in arraylist
                                       //DAta is in sorted order
        System.out.println(ts.higher(50));//  tree set bihind the seen follow karta h binary search tree
        System.out.println(ts.ceiling(50));}                                         //it follow in order traversal -->L.V.R. Left Value Right
}                                            // no duplicates value are allowed
