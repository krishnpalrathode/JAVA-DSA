package APIs;
//import java.util.Date;
public class Api1 {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);
        Long timeInMs = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.out.println(dt1);
    }

}
