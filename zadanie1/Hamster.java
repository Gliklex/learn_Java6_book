package zadanie1;

public class Hamster extends Rodent {
    @Override
    void bite() {
        System.out.println("Hamster.bite() ");
    }

    @Override
    String what() {
        return "Hamster";
    }
}
