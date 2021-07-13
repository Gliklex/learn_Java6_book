package zadanie5;

public class Unicycle extends Cycle {
    @Override
    void wrumwrum(Road r) {
        System.out.println("Unicycle.ride() " + r);
    }

    @Override
    void wheels() {
        System.out.println("Количество колес: 1");
    }
}
