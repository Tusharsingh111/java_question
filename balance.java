import java.util.Scanner;

public class balance {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int newbalance = Sc.nextInt();
        if (newbalance>100) {
            System.out.println("Profit");
        }
    }
}
