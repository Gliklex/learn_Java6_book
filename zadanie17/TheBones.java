package zadanie17;

import java.util.Random;

public class TheBones implements Game {
    private final Random rand = new Random();
    private int boneOne = rand.nextInt(6) + 1;
    private int boneTwo = rand.nextInt(6) + 1;
    public static GameFactory factory() {
        return new GameFactory() {
            @Override
            public Game checkResult() {
                return new TheBones();
            }
        };
    }


    @Override
    public void playGame() {
        System.out.println("Кидаю кости!");
        System.out.println("Первый кубик: " + boneOne);
        System.out.println("Второй кубик: " + boneTwo);
        System.out.println("Сумма: " + (boneTwo + boneOne));
    }
}
