import java.util.ArrayList;
import java.util.List;

public class TypeInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        for(Integer element : list){
            System.out.println(element);
        }
        List list1 = new ArrayList();
        list1.add(12);
        list1.add(15);
        int sum=0;
        int c = list1.get(0)+list1.get(1);
        System.out.println(c);
        for(Integer element : list1){
            sum=sum+element;
            System.out.println(element);
        }

    List<Integer> list2 = new ArrayList<>();
    list2.add(12);
    for(Integer element:list2){
        System.out.println(element);
    }
}

}