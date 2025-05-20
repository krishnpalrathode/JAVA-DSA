package SprintOne;

public class SwapWithout3var {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("value of a is  "+a +"  value of b is"+b);
         a = a^b;
         b=a^b;
         a=a^b;
        System.out.println("value of a is  "+a +"  value of b is"+b);

    }
}
