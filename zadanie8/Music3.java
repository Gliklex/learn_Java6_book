package zadanie8;
/*(2) Измените программу, чтобы в ней случайным образом генерировались объекты instrument,
    как в программе Shapes.java.
 */

public class Music3 {
    public static RndInstrumentGen gen = new RndInstrumentGen();

    public static void tune(Instrument i) {
       i.play(Note.MIDDLE_C);
   }

    public static void tuneAll(Instrument[] e) {
       for(Instrument i: e) {
           tune(i);
       }
   }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[12];
        for(int i = 0; i < orchestra.length;i++) {
            orchestra[i] = gen.next();
        }
        tuneAll(orchestra);

    }
}
