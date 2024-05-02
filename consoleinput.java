import java.io.Console;

public class consoleinput {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter your Name: ");
        String s = c.readLine();
        System.out.println("Welcome "+s);

        
    }
}
