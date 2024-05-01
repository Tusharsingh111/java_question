//import javax.swing.Box;

public class Generic {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Hello world!");
        String s = stringBox.getObject();
        System.out.println("String box value: "+s);
        Box<Integer>integerBox=new Box<>();
        integerBox.setObject(42);
        int i = integerBox.getObject();
        System.out.println("Integer box value: "+i);
    }
}
class Box<T>{
    private T object;
    public void setObject(T object){
        this.object=object;
    }
    public T getObject(){
        return object;
    }
}
