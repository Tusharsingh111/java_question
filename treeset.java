import java.util.Comparator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<String>(new comp());
        System.out.println(new comp());
        obj.add("Haryana");
        obj.add("Palwal");
        System.out.println("TreeSet: "+obj);
    }
}
class comp implements Comparator<String>{
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}
