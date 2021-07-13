package zadanie5;

public class Tricycle extends Cycle {
    @Override
    void wrumwrum(Road r) {
        System.out.println("Triycle.ride() " + r);
    }

    @Override
    void wheels() {
        System.out.println("Количество колес: 3");
    }
}
