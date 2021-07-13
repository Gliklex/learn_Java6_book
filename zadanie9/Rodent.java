package zadanie9;

public class Rodent {
    @Override
    public String toString() {
        return what();
    }
    void bite() {
        System.out.println("Rodent.bite() ");
    }

    String what() {
        return "Rodent";
    }
}
