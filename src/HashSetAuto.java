public class HashSetAuto {
    String marka;

    int power;

    String price;



    public HashSetAuto(int power, String price, String marka) {
        this.marka = marka;
        this.power = power;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof HashSetAuto) {
            HashSetAuto auto = (HashSetAuto) obj;
            if (this.power == auto.power && this.marka.equals(auto.marka)) return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return "HashSetAuto{" +
                "marka='" + marka + '\'' +
                ", power=" + power +
                ", price='" + price + '\'' +
                '}';
    }
}