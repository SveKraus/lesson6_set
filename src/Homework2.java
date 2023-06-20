import java.util.Set;
import java.util.TreeSet;

public class Homework2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(9);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


    }
}
