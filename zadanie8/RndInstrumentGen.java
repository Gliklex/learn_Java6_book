package zadanie8;

import java.util.Random;

public class RndInstrumentGen {
    private Random rnd = new Random();

    public Instrument next()  {
        switch (rnd.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Stringer();
            case 2: return new Woodwind();
            case 3: return new Brass();
            case 4: return new Drum();
            case 5: return new Percussion();
        }
    }
}
