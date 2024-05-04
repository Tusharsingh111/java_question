public class stackOverFlow {
   public static void main(String[] args) {
    stackOverFlow obj = new stackOverFlow();
    obj.abc();
   } 
   void abc(){
    xyz();
    int c=30/0;
    System.out.println("Error1"+c);
   }
   void xyz(){
    int d = 30/0;
    System.out.println("Error2"+d);
   }
}
