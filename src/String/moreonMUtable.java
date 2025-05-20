package String;

public class moreonMUtable {
    public static void main(String[] args) {
        //by default capacity of string is 16
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());
        //agar constructor me hi capacity add kari to
        StringBuffer sb2 = new StringBuffer("SACHIN");
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(3));
        sb2.setCharAt(2,'H');
        System.out.println(sb2);
        //capacity denna
        StringBuilder sb3 = new StringBuilder(150);
        System.out.println(sb3.capacity());
        sb3.append("java");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        sb3.trimToSize();
        System.out.println(sb3.capacity());
        System.out.println(sb3.reverse());
    }
}
