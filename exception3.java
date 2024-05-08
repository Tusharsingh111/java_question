public class exception3 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=20;
            int c=a/b;
            String st = " Helllo kittos";
            System.out.println("Hello Friends "+c);
            System.out.println("Hola Amigo"+st.toUpperCase());
        }
        catch(ArithmeticException e){
            System.out.println("Hello friends error "+e);
        }
        finally{
            System.out.println("Frienfd this is a final block");
        }
    }
}
