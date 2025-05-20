package LinkedListPw;

public class classLL {

    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void displayR(Node head){

        if(head==null){
            return;
        }
        System.out.println(head.data);
        displayR(head.next);
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data+" ");
            temp = temp.next;

        }
    }


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
       // System.out.println(a.data);
        //System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(19);
        Node f = new Node(34);
       // System.out.println(b);
        //System.out.println(a.next); // abhi link nahi hue
        a.next = b;
       // System.out.println(a.next);
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
      //  displayR(a);
        System.out.println(length(a));

       }

    }
