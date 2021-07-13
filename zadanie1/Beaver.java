package zadanie1;

public class Beaver extends Rodent {
    @Override
    void bite() {
        System.out.println("Beaver.bite() ");
    }

    @Override
    String what() {
        return "Beaver";
    }
}

