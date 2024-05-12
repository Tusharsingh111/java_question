public class Main {
    public static void main(String args[]){
        B obj = new B();
        obj.Show();
        obj.display();
    }
}
interface A{
    void Show();
    void display();
}
class B implements A{
    @Override
    public void Show (){
        System.out.println("HEY JAT");
    }
    @Override
    public void display(){
        System.out.println("BYE JAT");
    }
}