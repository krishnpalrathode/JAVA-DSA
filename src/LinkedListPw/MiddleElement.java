package LinkedListPw;

public class MiddleElement {
    class Node {
        int data;
        Node next;
        Node(int data){
             this.data = data;
        }
    }
    public static Node Middle(Node head){
        Node slow = head;
        Node fast = head;
     while(fast.next!=null && fast!=null){
         slow=slow.next;
         fast = fast.next.next;
     }
     return slow;
    }

    public static void main(String[] args) {
        MiddleElement list = new MiddleElement();
        Node a = list.new Node(3);
        Node b = list.new Node(10);
        Node c = list.new Node(34);
        Node d = list.new Node(35);
        Node e= list.new Node(356);
      Node f = list.new Node(104);

        a.next =b;
        b.next = c;
        c.next= d;
        d.next =e;
        e.next =f;

        Node result = Middle(a);
        System.out.println(result.data);
    }
}
