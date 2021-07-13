package zadanie3;

import java.util.Random;

public class RndShapeGen {
    private Random rnd = new Random(47);
    public Shape next()  {
        switch (rnd.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
