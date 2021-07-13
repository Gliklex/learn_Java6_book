package zadanie7;

public class Beaver implements Rodent {
    @Override
    public void bite() {
        System.out.println("Beaver.bite() ");
    }

    @Override
    public String toString() {
        return "Beaver";
    }
}

