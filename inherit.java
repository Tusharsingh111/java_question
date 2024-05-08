class A{
    void display(){
        System.out.println("This is class A");
    }
}
class B extends A{
    void display1(){
        System.out.println("This is class B");
    }
}



public class inherit {
    public static void main(String[] args) {
         B obj1=new B();
    obj1.display();
    obj1.display1();
    }
    
}
