class RBI{
    static float inter = 4;
    class BOI{
        float calculate(float principal,float time){
            float si=(float)(principal*inter*time)/100;
            return si;
        }
    }
}




public class interst {
    public static void main(String[] args) {
        RBI obj = new RBI();
        RBI.BOI obj1 = obj.new BOI();
        System.out.println("Simple Intrest: ");
        System.out.println(obj1.calculate(3000, 3));
    }
}
