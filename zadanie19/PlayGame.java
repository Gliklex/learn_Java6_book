package zadanie19;
/*(3) Создайте на базе паттерна «Фабричный метод» программную среду, моделирующую броски монет и броски кубиков.
 */

public class PlayGame {
    public static void playGame(GameFactory factory) {
        Game g = factory.checkResult();
        g.playGame();
    }

    public static void main(String[] args) {
        System.out.println("Орлянка!");
        playGame(new TheEgletFactory());
        System.out.println("\nКости!");
        playGame(new TheBonesFactory());
    }
}
