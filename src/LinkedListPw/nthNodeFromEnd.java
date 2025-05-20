package LinkedListPw;

public class nthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNodeSingletraversal(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            fast= fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node nthNode(Node head,int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        //mth element from the start
        int m = size - n + 1;
        temp = head;
        for (int i = 0; i < m -1; i++) {
            temp = temp.next;
        }
        return temp;
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

        Node temp = nthNode(a,2);
        System.out.println(temp.data);

        Node temp1 = nthNode(a,2);
        System.out.println(temp1.data);
    }
}