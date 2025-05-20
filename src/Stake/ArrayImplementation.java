package Stake;

public class ArrayImplementation {

    public static class Stack{
    private int arr[] = new int[5];
    private int idx = 0;
    void push(int x){
        if(isfull()){
            System.out.println("Stack is full!");
            return;
        }
    arr[idx] = x;
    idx++;
    }
    int peek(){
        if(idx==0){
            System.out.println("Stack is Empty!");
            return -1;
        }

        return arr[idx-1];
    }
    int pop(){
     if(idx==0){
         System.out.println("Stack is Empty!");
         return -1;
     }
     int top = arr[idx-1];
     arr[idx-1] = 0;
     idx--;
     return top;
    }
    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    int size(){
        return idx;
    }
    boolean isfull(){
        if(idx==arr.length){
        return true;
        }
        else return false;
        }

    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
        System.out.println();
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
