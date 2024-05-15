import java.util.*;
public class treeset2 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_Set = new TreeSet<Integer>();
        tree_Set.add(20);
        tree_Set.add(24);
        tree_Set.add(30);
        tree_Set.add(35);
        tree_Set.add(45);
        tree_Set.add(50);
        System.out.println("Tree Set Values are: "+tree_Set);
        Comparator comp = tree_Set.comparator();
        System.out.println("Since the Comparaator value is: "+comp);
        System.out.println("it follows natural odering");
    }
}
