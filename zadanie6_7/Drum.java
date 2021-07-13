package zadanie6_7;

public class Drum extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Drum.play() " + n);
    }

    @Override
    String what() {
        return "Drum";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Drum");
    }
}
