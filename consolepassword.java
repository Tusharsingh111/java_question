import java.io.Console;
public class consolepassword {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter Password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Password is:"+pass);
    }
}
