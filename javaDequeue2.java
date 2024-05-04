import java.util.ArrayDeque;
import java.util.Deque;

public class javaDequeue2 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.addFirst("JAVA");
        System.out.println("The First element is: "+deque);
        deque.addFirst("c++");
        System.out.println("After adding the next element in the frony of the dequeue is: "+deque);
        deque.addFirst("Python");
        System.out.println("The Final dequeue is: "+deque);
        int size = deque.size();
        System.out.println("The number of elements are: "+size);
        deque.removeLast();
        System.out.println("Dequeue after removing the last element is given as: "+deque);

        
    }
}
