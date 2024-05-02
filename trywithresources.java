import java.io.FileOutputStream;
public class trywithresources {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt")){
            String s = "This is me\n this is my first program of input output";
            byte byteArray[]=s.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfuly");

        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }
}
