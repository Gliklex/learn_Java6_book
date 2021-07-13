package zadanie8;
/*(2) В программе Sandwich.java из главы 8 создайте интерфейс с именем FastFood (с подходящими методами);
 измените класс Sandwich так, чтобы он реализовал этот интерфейс.
 */

public class Sandwich implements FastFood {
    private final Bread b = new Bread();
    private final Cheese c = new Cheese();
    private final Lettuce l = new Lettuce();
    private final Pickle p = new Pickle();

    @Override
    public void makeSandwich() {
        System.out.println("Sandwich() ");
    }

    public static void main(String[] args) {
        new Sandwich().makeSandwich();
    }
}
