package LinkedListPw;

import java.util.Dictionary;

public class ReverseLinkIterative {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static Node reverse(Node head){
     Node curr = head;
     Node prev = null;
     Node agla = null;
     while(curr!=null){
         agla = curr.next;
         curr.next = prev;
         prev = curr;
         curr = agla;

     }
     return prev;
    }
    public static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
       Node d = new Node(2);
        Node e = new Node(4);
       Node f = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        Display(a);
     Node newNode =  reverse(a);
        System.out.println();
        Display(newNode);
    }
}
