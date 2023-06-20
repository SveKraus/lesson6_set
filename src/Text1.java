import java.util.HashSet;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {

        Set<String> text = new HashSet<>();
        text.add("Собака");
        text.add("Кошка");
        text.add("Мышка");
        text.add("Белка");
        text.add("Хомяк");


        System.out.println(text.size());
    }
}
