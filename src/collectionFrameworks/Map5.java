package collectionFrameworks;
import java.util.*;
 class Employee {
private String name;
private int empId;
public Employee(String name,int empId){
    this.name=name;
    this.empId=empId;
}
public String toString(){
    return empId+ "";
}
}
public class Map5{
    public static void main(String[] args) {
     Employee e = new Employee("Krishna",121) ;
     e=null;

    }
}