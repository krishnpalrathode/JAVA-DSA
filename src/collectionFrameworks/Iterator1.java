package collectionFrameworks;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterator1
{
public static void main(String[] args)
{
  List l = new ArrayList()  ;
  l.add(10);
  l.add("deepak");
  l.add("rahul");

  //  System.out.println(l);
 Iterator itr=l.iterator();
 while(itr.hasNext())
 {
     System.out.println(itr.next());
 }
}
}
