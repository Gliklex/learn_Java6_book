package zadanie1;
/*(1) Измените упражнение 9 из предыдущей главы так, чтобы класс Rodent стал абстрактным (abstract) классом.
      Сделайте некоторые методы класса Rodent абстрактными (там, где это оправданно).
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
