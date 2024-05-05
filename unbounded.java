import java.util.List;
import java.util.Arrays;
class unbounded{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
        List<String> list3 = Arrays.asList("Heyoo");
        printlist(list1);
        printlist(list2);
        printlist(list3);

    }
    private static void printlist(List<?>list){
        System.out.println(list);
    }
}