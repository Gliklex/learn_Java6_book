package zadanie18;

public class Bicycle implements Cycle {
    private static final int WHEELS = 2;

    public void run() {
        System.out.println("колес у Bicycle: " + WHEELS);
    }
}

