package zadanie16;
/* (2) Включите класс RectangularGlyph в PotyConstructors.java. Продемонстрируйте проблему, описанную в этом разделе.
    (проблему вызова динамических методов в конструкторе)
 */

public class PolyConstructros {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(7,5);
    }
}
