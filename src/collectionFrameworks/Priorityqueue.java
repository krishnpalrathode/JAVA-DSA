package collectionFrameworks;
import java.util.PriorityQueue;
public class Priorityqueue
{
    public static void main(String[] args)
    {

     PriorityQueue pq = new PriorityQueue();
     pq.add(100);                               //The priorityQueue class implements the Queue interface.
     pq.add(150);                             //it holds the element or object which are to be processed by the priority queue doesn't
                                              // allow null value to be stored in the queue. pq.add(125);
     pq.add(50);
     pq.add(75);
     pq.add(175);
        System.out.println(pq);// order of insertion is not preserved and not retained
        //it rather follow min-heap
        //duplicated are allowed
        //koi or type of data nahi dal sakte
    }
}
