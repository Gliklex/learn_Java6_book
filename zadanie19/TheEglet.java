package zadanie19;

import java.util.Random;

public class TheEglet implements Game {
    private final Random rand = new Random();
    private  int restut = rand.nextInt(2);

    @Override
    public void playGame() {
        System.out.println("Кидаю монетку!");
        System.out.println("Орёл или решка?");
        if (restut < 1) {
            System.out.println("Орёл!");
        } else {
            System.out.println("Решка!");
        }
    }
}
