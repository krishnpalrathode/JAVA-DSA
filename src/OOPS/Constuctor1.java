package OOPS;

public class Constuctor1 {
    // Default constructor called by compliler automatically on creating of object:
//    int i;
//
//    public static void main(String[] args) {
//        Constuctor1 obj = new Constuctor1();
//        System.out.println(obj.i);


    // No arrgument constructor :
//    int i;
//    String s;
//    Constuctor1(){
//        System.out.println("No argument constructor");
//    }
//
//    public static void main(String[] args) {
//        Constuctor1 obj = new Constuctor1();
//        System.out.println(obj.i + " " + obj.s);


    Constuctor1(int a) {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        Constuctor1 obj = new Constuctor1(10);


    }
}
