package zadanie7;
/*(1) Измените упражнение 9 из главы 8 так, чтобы тип Rodent был оформлен как интерфейс.
 */

public class Cage {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Hamster(),
                new Beaver()
        };

        for(Rodent rodent: rodents) {
            System.out.println(rodent);
            rodent.bite();
        }
    }
}
