package zadanie18;
/*(2) Создайте интерфейс Cycle с реализациями Unicycle, Bicycle й Tricycle.
Создайте фабрикудля каждой разновидности Cycle и код, использующий эти фабрики.
 */
public class Cycles {
    public static void hMWeels(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.run();
    }

    public static void main(String[] args) {
        hMWeels(new UnicycleFactory());
        hMWeels(new BicycleFactory());
        hMWeels(new TricycleFactory());
    }
}
