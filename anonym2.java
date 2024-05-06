interface anonyinter{
    void show();
}

public class anonym2 {
    public static void main(String[] args) {
        anonyinter obj = ()->{
            System.out.println("Hello everyone");
        };
        obj.show();
    }
}
