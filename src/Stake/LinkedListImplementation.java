package Stake;

import collectionFrameworks.LinkedList;



public class LinkedListImplementation {

    public static class Node { //user defined data type
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
   public static class LLstack{  //user defined data structure
   private Node head = null;
   private int size =0;
   void push(int x){
     Node temp = new Node(x);
     temp.next = head;
     head = temp;
     size++;
   }
   void display( ) {

       }
   void displayrev(){
       Node temp= head;
       while (temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
       System.out.println();
   }
   int size(){ //getter
       return size;
   }

   boolean isEmpty(){
       if(size==0){
           return true;
       }
       else return false;
   }

   int pop(){
    if(head==null){
        System.out.println("List is empty!");
        return -1;
    }
    int x= head.data;
    head = head.next;
    return x;
   }
   int peek(){
       if(head==null){
           System.out.println("List is empty!");
           return -1;
       }
       return head.data;
   }
   }

    public static void main(String[] args) {
    LLstack st = new LLstack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.display();
    }

}
