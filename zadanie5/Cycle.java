package zadanie5;

class Cycle {
    public enum Road {
        ON_ROAD, ON_WATER, FLY
    }
    void wheels(){
        System.out.println("Количество колес: ");
    }

    void wrumwrum(Road r) {
        System.out.println("Cycle.ride() " + r);
    }
}
