import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorInt {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(70);
        treeSet.add(5);
        System.out.println("Set before using the comparator: "+treeSet);
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>(new Helper());
        treeSet2.add(30);
        treeSet2.add(20);
        treeSet2.add(10);
        treeSet2.add(50);
        treeSet2.add(70);
        treeSet2.add(5);
        System.out.println("The element sorted in descending order:"+treeSet2);
    }
}
class Helper implements Comparator<Integer>{
    public int compare(Integer str1, Integer str2){
        Integer first_str;
        Integer second_str;
        first_str =str1;
        second_str=str2;
        return first_str+second_str;
    }
}
