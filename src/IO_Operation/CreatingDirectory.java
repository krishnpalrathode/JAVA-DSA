package IO_Operation;
import java.io.*;
public class CreatingDirectory {
    public static void main(String[] args) {
        File dir = new File("PWJava");
        System.out.println(dir.isDirectory());

        dir.mkdir();
        File file = new File(dir,"pwskills.txt");

        System.out.println(dir.exists());
    }
}
