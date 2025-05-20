package LinkedListPw;

public class IntersectionLinkedList {
   public static class Node{
       int  data;
       Node next;

       Node(int  data){
           this.data = data;
       }
   }
   public static int intersection(Node head1,Node head2,int n){
       Node temp1 = head1;
       Node temp2 = head2;
       for(int i=0;i<n;i++){
           temp1=temp1.next;
       }
       while(temp1!=temp2){
           temp1 = temp1.next;
           temp2 = temp2.next;
       }
       return temp1.data;
   }
   public static int display(Node head){
       int size =0;
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
           size++;


       }
       return size;
   }

    public static void main(String[] args) {
       IntersectionLinkedList ll = new IntersectionLinkedList();
   // first ll

        Node a =new Node(87);
        Node b =new Node(100);
        Node c =new Node(13);
        Node d =new Node(4);
        Node e =new Node(5);
        Node f =new Node(12);
        Node g =new Node(10);

//second ll
        Node h =new Node(90);
        Node i =new Node(9);
    //linked list 1
        a.next =b;
        b.next = c;
        c.next= d;
        d.next =e;
        e.next =f;
        f.next = g;
        //87->100->13->4->5->12->10


        //lisnked list 2
        h.next =i;
        i.next =e;
        //90->9->5->12->10

       int size1 = display(a);
        System.out.println();
        System.out.println("size is"+size1);
        int size2 = display(h);
        System.out.println();
        System.out.println("size is "+size2);
        int n = size1 - size2;
      int result  =  intersection(a,h,n);
        System.out.println("intersecting node is "+result);
    }
}
