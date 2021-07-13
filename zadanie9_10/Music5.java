package zadanie9_10;
/*
Переделайте программу Music5.java, переместив общие методы Wind, Percussion и Stringed в абстрактный класс.
 */

public class Music5 {
    public static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Playable[] e) {
        for (Playable i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);
    }
}