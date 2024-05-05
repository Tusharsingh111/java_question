
 class A{

    int display(int x,int y){
        static class B{
            int z=15;
            int sum(int p,int q ){
                return p+q;
            }
        }
        B objB = new B();
        objB.sum(23, 45);
       // return x+y;
    }
}


public class classinsidefunc {
    public static void main(String[] args) {
        A obj = new A();
        obj.display(10,20);
        //A.B obj1 = new A.B();
    }
}
