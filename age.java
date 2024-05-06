class father{
    static int motherage =39;
    class son{
    void show(int fatherage,int Sonage){
        System.out.println("Age of mother is: "+motherage);
         System.out.println("Age of father is: "+fatherage);
         System.out.println("Age of Son is: "+Sonage);
}
    }
}

public class age {
    public static void main(String[] args) {
        father obj = new father();
        father.son obj1 = obj.new son();
        obj1.show(40, 19);
    }
}
