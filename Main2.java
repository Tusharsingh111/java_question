interface A {
    int x = 10;

    void Sum();

    int Print();
    default int Subtract(){
        return 10-2;
    }
    static int Subtract1(){
        return 10-4;
    }
}
interface Z {
    int multi();
}
class B implements A,Z {
    @Override
    public void Sum() {
        System.out.println("Hey It's B");
    }

    @Override
    public int Print() {
        return 10;
    }
    @Override
    public int multi(){
        return 3*12;
    }
}
class C implements A{
    @Override
    public void Sum(){
        System.out.println("Hello from C");
    }
    @Override
    public int Print() {
        return 52;
    }
}
interface D extends A,Z{
    void Negate();
}
public class Main2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.Sum();
        System.out.println(obj.Print());
        A obj2 = new C();
        obj2.Sum();
        System.out.println(obj2.Print());
        System.out.println(A.Subtract1());
        System.out.println(obj2.Subtract());
        System.out.println(A.x);
        System.out.println(obj.multi());
    }
}
