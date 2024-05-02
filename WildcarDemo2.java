import java.util.List;
import java.util.Arrays;
public class WildcarDemo2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,5,6,7);
        printOnlyIntegerClassorSuperClass(list1);
        List<Number> list2 = Arrays.asList(4,5,6,7);
        printOnlyIntegerClassorSuperClass(list2);
    }
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer>list){
        System.out.println(list);
    }
    }
