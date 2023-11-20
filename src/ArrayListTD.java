import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTD {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

        list.add("la");
        list.add("vie");
        list.add("vie");
        list.add("un long");
        list.add("fleuve tranquille");

        System.out.println(list);

        list.add(2, "est");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.set(0, list.get(0).substring(0, 1).toUpperCase() + list.get(0).substring(1).toLowerCase());
        System.out.println(list);

        list.set(4, list.get(4) + ".");
        System.out.println(list);

        list.sort(String::compareTo);
        System.out.println(list);
    }
}
