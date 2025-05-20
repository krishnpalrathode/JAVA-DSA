package IO_Operation;
import java.util.*;
class Students{
    private String name;
    private int age;
    private String city;
    public Students(String name,int age,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString(){
        return "Name: "+name + "|age :"+age+ "| city"+city;
    }
}


public class fundamenta1 {
    public static void main(String[] args) {
Students st1 =new Students("virat",34,"Banglore");
        System.out.println(st1);
    }
}
