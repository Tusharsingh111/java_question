import java.util.TreeSet;

public class treeset1 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(20);
        tree_set.add(24);
        tree_set.add(30);
        tree_set.add(35);
        tree_set.add(45);
        tree_set.add(50);
        System.out.println("Tree Set Values are: "+tree_set);
        Comparator comp = tree_set.comparator();
        System.out.println("Since the Comparator value is :");
        System.out.println("Hello");

    }
}
