package zadanie18;

public class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Unicycle.balance()");
    }

    @Override
    void wrumwrum(Road r) {
        System.out.println("Unicycle.ride() " + r);
    }
}
