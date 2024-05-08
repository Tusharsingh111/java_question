public class fir {
    public static void main(String args[]){
        StringBuilder sb =  new StringBuilder("Hello, World!");
        System.out.println("OriginalString"+sb);

        sb.setLength(15);
        System.out.println("After SetLength(15):"+sb);
        sb.setLength(5);
        System.out.println("After Setlength(5):"+sb);
        sb.setLength(4);
        System.out.println("After Setlength(12):"+sb);

    }
}
