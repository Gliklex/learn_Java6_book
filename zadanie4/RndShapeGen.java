package zadanie4;

import java.util.Random;

public class RndShapeGen {
    private Random rnd = new Random(94);
    public Shape next()  {
        switch (rnd.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Hexagon();
        }
    }
}
