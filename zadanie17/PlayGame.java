package zadanie17;
/*(3) Создайте на базе паттерна «Фабричный метод» программную среду, моделирующую броски монет и броски кубиков.
    (1) Измените решение упражнения 19 из главы 9 так, чтобы в нем использовались анонимные внутренние классы.
 */

public class PlayGame {
    public static void playGame(GameFactory factory) {
        Game g = factory.checkResult();
        g.playGame();
    }

    public static void main(String[] args) {
        System.out.println("Орлянка!");
        playGame(TheEglet.factory());
        System.out.println("\nКости!");
        playGame(TheBones.factory());
    }
}
