package zadanie1;

class Cycle {
    public enum Road {
        ON_ROAD, ON_WATER, FLY
    }
    void wrumwrum(Road r) {
        System.out.println("Cycle.ride() " + r);
    }
}
