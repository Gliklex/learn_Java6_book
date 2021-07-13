package zadanie18;

public class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Bicycle.balance()");
    }

    @Override
    void wrumwrum(Road r) {
        System.out.println("Bicycle.ride() " + r);
    }
}
