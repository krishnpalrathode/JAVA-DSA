package Generics;
import java.util.*;

public class gen4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("pw");
        al2.add("Krishna");
        al2.add("pal");
        al2.add("singh");
        al2.add("Rathode");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
         al3.add(10);
         al3.add(20);
         al3.add(30);
         al3.add(40);
         al3.add(50);
         al3.add(20);

        System.out.println(al3);

        int index = Collections.binarySearch(al3,30);
        int index2 = Collections.binarySearch(al3,60);
//        System.out.println(index);
//        System.out.println(index2);
//

        Collections.rotate(al3,3);
        System.out.println(al3);
        Collections.shuffle(al3);
        System.out.println(al3);

        System.out.println( Collections.frequency(al3,20));


    }
}
