import java.util.*;

public class Main {
    public static void main(String[] args) {
        autos();
    }

        static void autos () {
        HashSetAuto auto1 = new HashSetAuto(350, "65 Euro", "Mercedes");
        HashSetAuto auto2 = new HashSetAuto(288, "50 Euro", "Meazda");
        HashSetAuto auto3 = new HashSetAuto(367, "67 Euro", "Audi");
        HashSetAuto auto4 = new HashSetAuto(367, "67 Euro", "Audi");

        Set<HashSetAuto> autos = new HashSet<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);


            System.out.println(autos);




        }
    }




