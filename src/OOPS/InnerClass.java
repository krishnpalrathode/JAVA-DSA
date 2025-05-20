package OOPS;

class Ab
{
    public void show(){
        System.out.println("in show");
    }
    class Ba
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
    Ab obj = new Ab();
    obj. show();
    Ab.Ba obj1 = obj.new Ba();
    obj1.display();
    }
}
