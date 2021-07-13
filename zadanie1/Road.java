package zadanie1;
/*(2) Создайте класс Cycle с производными классами Unicycle,
      Bicycle и Tricycle. Покажите, что экземпляр каждого из производных типов может быть преобразован в Cycle,
      на примере вызова метода ride().
 */

public class Road {
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(u,1);
        ride(b,2);
        ride(t,11);
    }

    public static void ride(Cycle c, int i) {

        if (i == 1) {
            c.wrumwrum(Cycle.Road.ON_ROAD);
        } else if (i == 2) {
            c.wrumwrum(Cycle.Road.FLY);
        } else {
            c.wrumwrum(Cycle.Road.ON_WATER);
        }
    }
}
