package collectionFrameworks;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
class Student {
    private String name;
    private int age;
    private String city;



    public Student(String name, int age, String city){
     this.name =name;
     this.city=city;
     this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return name + " "+ age +" " + city;
    }
}


public class map3 {
    public static void main(String[] args) {
        Student st1= new Student("krishna",21,"Indore");
        Student st2 = new Student("Rajesh",32,"bhopal");
        Student st3 =new Student("Virat",32,"Banglure");
         Map map =new HashMap();
         map.put(1,st1);
         map.put(2,st2);
         map.put(3,st3);
        System.out.println(map);
        Set set =map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            //System.out.println( itr.next());
            Map.Entry data =(Entry)itr.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}
