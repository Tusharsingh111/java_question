class A{
    void display(){
        System.out.println("CLASS A");
    }
}

class B extends A{
    void display2(){
        System.out.println("CLASS B");
    }
}
class C extends B{
    void display3(){
        System.out.println("CLASS C");
    }
}
class D extends C{
    void display4(){
        System.out.println("CLASS D");
    }

}
public class inherit2 {
    public static void main(String[] args) {
        D obj1 = new D();
        obj1.display();
        obj1.display2();

        obj1.display3();
        obj1.display4();
    }
}
