public class ostring {
    public static void main(String[] args) {
        num c1 = new num(20,38);
        System.out.println(c1);
    }
}
class num{
    private double re,im;
    public num(double re,double im){
        this.re=re;
        this.im=im;
    }
    public double getReal(){
        return this.re;
    }
    public double getImaginary(){
        return this.im;
    }
    @Override
    public String toString(){
        return this.re+" "+this.im+"i";
    }
}