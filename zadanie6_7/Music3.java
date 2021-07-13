package zadanie6_7;
/*6. (1) Измените программу Music3.java так, чтобы метод what() стал методом корневого Knacca Object toString().
Попробуйте вывести информацию об объектах Instrument вызовом System. out. println() (без использования преобразований).
  7. (2) Добавьте новый подтип Instrument в программу Music3.java.
Убедитесь в том, что полиморфизм работает правильно и для этого нойого типа.
 */

public class Music3 {
   public static void tune(Instrument i) {
       i.play(Note.MIDDLE_C);
   }

   public static void tuneAll(Instrument[] e) {
       for(Instrument i: e) {
           tune(i);
       }
   }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringer(),
            new Brass(),
            new Woodwind(),
            new Drum()
        };
        tuneAll(orchestra);

        System.out.println(new Wind());
        System.out.println(new Percussion());
        System.out.println(new Stringer());
        System.out.println(new Brass());
        System.out.println(new Woodwind());
        System.out.println(new Drum());
    }
}
