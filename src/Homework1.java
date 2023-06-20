import java.util.HashSet;
import java.util.Set;

public class Homework1 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(6);
        hashSet1.add(8);
        hashSet1.add(7);
        hashSet1.add(1);
        hashSet1.add(4);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(9);
        hashSet2.add(6);
        hashSet2.add(7);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

    }

}
