import java.io.FileReader;
import java.nio.File;

public class testFile {
    public static void main(String[] args) {
        File file = new File("C:/Users/tusha/Desktop/java");
        FileReader reader = new FileReader(file);
        int ch;
        while((ch=reader.read())!=-1){
            System.out.println((char)ch);
        }
        reader.close();
    }
}
