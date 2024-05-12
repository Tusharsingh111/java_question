public class Main3 {
    public static void main(String[] args) {
        B obj = new B();
        int c = obj.sum();
        System.out.println(c);
    }
}


@FunctionalInterface 
interface Sum{
     int sum();
}
class B implements Sum{
    @Override
    public int sum(){
        return 5+5;
    }
}