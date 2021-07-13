package zadanie5;
/* В упражнении 1 добавьте в класс Cycle метод wheels(),
    возвращающий количество колес каждого транспортного средства.
    Измените метод ride() так, чтобы он вызывал wheels(),
    и убедитесь в том, что полиморфизм успешно работает.
 */

public class Road {
    public static void ride(Cycle c, int i) {
        if (i == 1) {
            c.wrumwrum(Cycle.Road.ON_ROAD);
        } else if (i == 2) {
            c.wrumwrum(Cycle.Road.FLY);
        } else {
            c.wrumwrum(Cycle.Road.ON_WATER);
        }

        c.wheels();
        System.out.println();
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(u,1);
        ride(b,2);
        ride(t,11);
    }
}
