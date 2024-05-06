abstract class Human{
    abstract void eat();
}


public class anonymouscls {
    public static void main(String[] args) {
        Human p = new Human() {
            void eat(){
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
