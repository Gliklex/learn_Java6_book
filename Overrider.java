public class Overrider {
    void rider(int i) {
        System.out.println("rider " + i);
    }
    void rider(String s) {
        System.out.println("rider " + s);
    }
    void rider(int i, String s) {
        System.out.println("rider " + i + " " + s);
    }
}

class RiderOver extends Overrider {
    void rider() {
        System.out.println("rider");
    }
    public static void main(String[] args) {
        RiderOver rO = new RiderOver();
        rO.rider();
        rO.rider(7);
        rO.rider("конь");
        rO.rider(5, "конь");
    }
}
