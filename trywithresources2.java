import java.io.FileOutputStream;
public class trywithresources2 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")){
            String m = "This is me\n here we have used finally also ";
            byte byteArray[]=m.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Data written Successfully");
        }catch(Exception exception){
            System.out.println(exception);
        }
        finally{
            System.out.println("Finally executes after closing of declared resources");
        }
    }
    
}
