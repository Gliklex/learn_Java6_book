package zadanie6_7;

public class Stringer extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Stringer.play() " + n);
    }

    @Override
    String what() {
        return "Stringer";
    }


    @Override
    void adjust() {
        System.out.println("Adjusting Stringer");
    }
}
