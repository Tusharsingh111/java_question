import java.util.Comparator;
import java.util.TreeSet;
public class Comparator1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("H");
        treeSet.add("E");
        treeSet.add("L");
        treeSet.add("L");
        treeSet.add("O");
        treeSet.add("8");
        System.out.println("Set before using the comparator: "+treeSet);
        TreeSet<String> treeSet2 = new TreeSet<String>(new Helper());
        treeSet2.add("H");
        treeSet2.add("E");
        treeSet2.add("L");
        treeSet2.add("L");
        treeSet2.add("O");
        treeSet2.add("8");
        System.out.println("The element sorted in descending order:"+treeSet2);
    }
}
class Helper implements Comparator<String>{
    public int compare(String str1, String str2){
        String first_str;
        String second_str;
        first_str =str1;
        second_str=str2;
        return second_str.compareTo(first_str);
    }
}
