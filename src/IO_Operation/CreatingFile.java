package IO_Operation;
import java.io.*;
public class CreatingFile {
    public static void main(String[] args) {
        File file1 = new File("pw.txt");
        System.out.println(file1.exists());
       try{
        file1.createNewFile();
        System.out.println(file1.exists());
    }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
    }
}
