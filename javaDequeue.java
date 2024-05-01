import java.util.ArrayDeque;
import java.util.Deque;

public class javaDequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println("Inserting three elements");
        for(Integer a : deque){
            System.out.println(a);
        }
        deque.pop();
        System.out.println("After popping : ");
        for(Integer a : deque){
            System.out.println(a);
        }
        deque.remove(3);
        System.out.println("Removing the element 3 : "+deque);
    }
}
