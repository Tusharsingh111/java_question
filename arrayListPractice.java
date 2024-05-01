import java.util.ArrayList;
import java.util.List;

public class arrayListPractice {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("HARYANA");
        a.add("PUNJAB");
        a.add("DELHI");
        System.out.println("THESE ARE THE STRINGS: ");
        for(String name : a){
            System.out.println(name.substring(0,3));
        }
    }
}
