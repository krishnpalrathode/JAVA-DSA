package SingletonPattern.java;

public class Sammosa {

    private static Sammosa sammosa;
    private Sammosa(){
        System.out.println("Eating dsa");
    }
    //Lazy way of creating single object
    public static Sammosa getSammosa(){
        //object of this class
        if(sammosa==null){
            sammosa=new Sammosa();
        }
        return sammosa;
    }
}
