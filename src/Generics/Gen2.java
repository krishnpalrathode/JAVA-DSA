package Generics;
import java.util.*;
 class Student{
     private String name;
     private int id;

 }
 class Employee1{
     private String name;
     private int id;
 }
public class Gen2 {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2 =new Student();
        Student st3 =new Student();

        Employee1 em1=new Employee1();
        Employee1 em2=new Employee1();

        ArrayList<Student> ar =new ArrayList<Student>();
        ar.add(st1);
        ar.add(st2);
      //  ar.add(em1);

    }
}
