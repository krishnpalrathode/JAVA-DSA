package LinkedListPw;

public class classLL2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public static class linkedlist{
          Node head = null;
          Node tail = null;
          int size = 0;

          //Function to insert at any given
            void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size){
             inserAtEnd(val);

             return;
            }
            else if(idx==0){
                insertAtBeginning(val);

                return;
            }

            // is for loop se ham temp ko head se lekar vha tak jayenge
                //jiske bad hame value insert karni ho
            for(int i=0;i<idx-1;i++){
             temp=temp.next;
            }
            //or yha hamara connection ban gya
            t.next= temp.next;
            temp.next=t;
            size++;

            }
          //function to insert node at beginning
          void insertAtBeginning(int val){
              Node temp = new Node(val);
              //if linked list is empty
              if(head==null)
              {
                  head=temp;
                  tail = temp;
              }
              //if linked_List is Not empty
              else{
                temp.next=head;
                head = temp;
              }
              size++;
          }

          // Function to insert value at the end of Linked List
          void inserAtEnd(int val){
            Node temp = new Node(val);

            // if linked list is empty

            if(head==null){
                head = temp;
                tail = temp;
            }
            //Agar already koi elements h too
            else{
                tail.next = temp;
                tail = temp;

            }
            size++;
          }
          void display(){
              Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
          }
//            int size(){ // here time complexity is order of n
//                int count=0;
//                Node temp = head;
//                while(temp!=null){
//                    count++;
//                    temp =temp.next;
//                }
//           return count;
//          }
          int getElementOf(int idx){
              Node temp=head;
                for(int i=0;i<idx;i++){
                   temp=temp.next;

                }
              int result = temp.data;
                return result;
          }
            void DeleteAt(int idx){
                if(idx==0){
                    head=head.next;
                }
            Node temp = head;

                for(int i=1;i<=idx-1;i++){
                   temp=temp.next;
                }
                temp.next= temp.next.next;
                tail=temp;
                size--;
            }


        }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.inserAtEnd(4); // 4
        ll.inserAtEnd(5); //4 5
        ll.insertAtBeginning(1); //1->4->5
        ll.insertAtBeginning(7);//7->1->4->5
        ll.insertAt(4,19); //7->19->1->4->5
        System.out.println(ll.tail.data );

        ll.display();
        System.out.println();
        System.out.println(ll.getElementOf(2));
        System.out.println(ll.size);
        ll.DeleteAt(2);

        ll.display();
    }
}
