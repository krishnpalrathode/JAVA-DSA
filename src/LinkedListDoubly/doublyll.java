package LinkedListDoubly;

public class doublyll {
    public static class Node{
        int val;
        Node next;
        Node prev;
         Node(int val){
             this.val=val;
         }
    }
    // display
    public static void display(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    //display reverse using tail
    public static void displayrev2(Node tail){
        Node temp= tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }
    public static void dispalyRandom(Node random){
        Node temp = random;
        //Move this temp backward to the head
        while(temp.prev!=null){
            temp= temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);

        a.prev=null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev =b;
        c.next = d;
        d.prev = c;
        d.next= e;
        e.prev =d;
        e.next = f;
        f.prev = e;
        f.next=null;
        display(a);
        System.out.println();
        displayrev2(f);
        System.out.println();
        dispalyRandom(c);

    }
}
