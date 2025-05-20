package SingletonPattern.java;

public class Example {
    public static void main(String[] args) {
        Sammosa sammosa1=Sammosa.getSammosa();
        System.out.println(sammosa1.hashCode());

        Sammosa sammosa2=Sammosa.getSammosa();
        System.out.println(sammosa2.hashCode());

    }
}
