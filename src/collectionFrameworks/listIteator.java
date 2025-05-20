package collectionFrameworks;
import java.util.List;
import java.util.*;

public class listIteator
{
    public static void main(String[] args)
    {
     List l = new ArrayList();

     l.add(10);
     l.add("deepak");
     l.add("rahul");

  //   System.out.println("l");
ListIterator li = l.listIterator();
while(li.hasNext())
{
    System.out.println(li.next());
}
while(li.hasPrevious())
{
    System.out.println(li.previous());
}

    }
}
