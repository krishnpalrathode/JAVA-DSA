package LinkedListPw;

public class DeletingMiddleElement {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node Middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        DeletingMiddleElement list = new DeletingMiddleElement();
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

        list.display(result);
    }
}