package zadanie18;
/*(2) Используя иерархию Cycle из упражнения 1, включите метод balance() в классы Unicycle и Bicycle, но не в Tricycle.
    Создайте экземпляры всех трех типов и выполните их восходящее преобразование в массив Cycle.
    Попробуйте вызвать balance() для каждого элемента массива.
    Теперь выполните нисходящее преобразование, вызовите balance() и проанализируйте результат.
 */

public class Road {
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        Cycle[] cycles = {
                u,
                b,
                t
        };

        //cycles[0].balance();
        //cycles[1].balance();
        //cycles[2].balance();

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        //((Tricycle)cycles[2]).balance();
    }
}
