package OOPS;

import java.sql.SQLOutput;

public class polyMorphism {
   int show(int a)
    {
        System.out.println("1");
    return 0;
    }
    void show(String b,int a)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        polyMorphism obj = new polyMorphism();
        obj.show("krishna",8);

    }



    }

//    public static void main(int a){
//        System.out.println("rajput");
//    }
