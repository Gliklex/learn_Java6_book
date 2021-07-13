package zadanie9_10;

class Percussion extends Instrument implements Playable{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + "Adjust()");
    }
}
