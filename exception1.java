import java.util.*;
public class exception1 {
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            //System.out.println(c);
            String s = sc.nextLine();
            System.out.println(s);
        }
        catch (ArithmeticException e){
            System.out.println("This is catch block");

        }
        System.out.println("Hola Amigo");
    }
}
