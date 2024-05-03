

class outerA{
    void sum(int x,int y){
       System.out.println(x+y);
    }

    static class innerA{
        void sum1(int a,int b){
            System.out.println(a+b);
        }
    }
}

public class nested {
    public static void main(String[] args) {
       outerA obj = new outerA(); 
       obj.sum(10, 400);
       outerA.innerA obj1 =new outerA.innerA();
       obj1.sum1(10,30);
    }
}
