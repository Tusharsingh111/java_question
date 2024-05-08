import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            String x = null;
            int c = a/b;
            System.out.println(c);
            System.out.println(x.toUpperCase());
        }
        catch(ArithmeticException e){
            System.out.println("Error occured: "+e);
        }
    }
}
