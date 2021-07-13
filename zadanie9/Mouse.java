package zadanie9;

public class Mouse extends Rodent {
    @Override
    void bite() {
        System.out.println("Mouse.bite() ");
    }

    @Override
    String what() {
        return "Mouse";
    }
}