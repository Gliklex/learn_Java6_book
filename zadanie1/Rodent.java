package zadanie1;

public abstract class Rodent {
    @Override
    public String toString() {
        return what();
    }

    abstract void bite();

    String what() {
        return "Rodent";
    }
}
