package zadanie1;

public class Bicycle extends Cycle {
    @Override
    void wrumwrum(Road r) {
        System.out.println("Bicycle.ride() " + r);
    }
}
