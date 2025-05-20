package LinkedListPw;

public class ReverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
      if(head.next==null) return head;
      Node newHead = reverse(head.next);
      head.next.next = head;//interchanging the connection
        head.next =null;
        
        return newHead;

    }
    public static void dispaly(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        dispaly(head.next);

    }
    public static void main(String[] args) {
        Node  a = new Node(3);
        Node  b = new Node(5);
        Node  c = new Node(1);
        Node  d = new Node(2);
        Node  e = new Node(4);
        Node  f = new Node(8);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        dispaly(a);
        Node r = reverse(a);
        System.out.println();
        dispaly(r);
    }
}
