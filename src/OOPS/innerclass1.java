package OOPS;

public class innerclass1 {

        class engine
        {
        void disp(){
            System.out.println("ineer class display");
        }
        }
    public static void main(String[] args)
    {
        System.out.println("Main method outer class");
        innerclass1 car = new innerclass1();

      innerclass1.engine e = car.new engine();
      e.disp();

    }


    }


