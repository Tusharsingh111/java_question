abstract class voice{
    abstract void woff();
}



public class sound {
    public static void main(String[] args) {
        voice v = new voice() {
            void woff(){
                System.out.println("dog voice");
            }
        };
        v.woff();
    }
}
