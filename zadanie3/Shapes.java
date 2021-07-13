package zadanie3;
/*Включите в базовый класс Shape.java новый метод, выводящий сообщение,
  но не переопределяйте его в производных классах. Объясните результат.
  Переопределите его в одном из производных классов и посмотрите, что происходит.
  Наконец, переопределите метод во всех производных классах.
 */

public class Shapes {
    private static RndShapeGen gen = new RndShapeGen();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
            shp.act();
        }
    }
}
