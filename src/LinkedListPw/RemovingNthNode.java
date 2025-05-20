package LinkedListPw;

public class RemovingNthNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head= head.next;
        }
    }
 public static Node deleteNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        if(fast==null){
            head= head.next;
            return head;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next= slow.next.next;
        return head;

 }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(14);
        Node d = new Node(20);
        Node e = new Node(100);
        Node f = new Node(120);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    display(a);
    System.out.println();
    a = deleteNthNode(a,6);
        display(a);
    }
}