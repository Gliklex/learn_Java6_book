package zadanie6_7;

class Instrument {
    @Override
    public String toString() {
        return what();
    }

    void play(Note n) {
    System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
    System.out.println("Adjusting Instrument");
    }
}


