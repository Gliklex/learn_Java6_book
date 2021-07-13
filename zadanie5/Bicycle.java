package zadanie5;

public class Bicycle extends Cycle {
    @Override
    void wrumwrum(Road r) {
        System.out.println("Bicycle.ride() " + r);
    }

    @Override
    void wheels() {
        System.out.println("Количество колес: 2");
    }
}
