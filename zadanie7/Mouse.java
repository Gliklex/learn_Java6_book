package zadanie7;

public class Mouse implements Rodent {
    @Override
    public void bite() {
        System.out.println("Mouse.bite() ");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}