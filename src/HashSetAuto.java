import java.util.HashSet;
import java.util.Set;

public class HashSetAuto {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Автомобиль 1");
        set.add("Автомобиль 2");
        set.add("Автомобиль 3");
        set.add("Автомобиль 4");
        set.add("Автомобиль 5");
        set.add("Автомобиль 6");

        System.out.println(set);

        for (String s: set) {

            System.out.println(s);

        }

    }
}
