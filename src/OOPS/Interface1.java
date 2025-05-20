package OOPS;

import java.sql.SQLOutput;
interface Computer{
      void CompileCode();
}
class Laptop implements Computer
{
    public void CompileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer
{

    public void CompileCode()
    {
        System.out.println("You got 5 errors  : faster ");
    }
}

class Developer
{
    public void buildapp(Computer obj){



        System.out.println("Building app :");

        obj.CompileCode();
    }

}

public class Interface1 {
    public static void main(String[] args) {
      //  Laptop obj = new Laptop();
      Computer obj = new Desktop();
     Developer dev = new Developer();
     dev.buildapp(obj);
     //Desktop des = new Desktop();
     //des.CompileCode();

    }
}
