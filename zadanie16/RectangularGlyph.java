package zadanie16;

public class RectangularGlyph extends Glyph {
    private int a, b, c, d;

    RectangularGlyph(int ta, int tb) {
        a = ta;
        b = tb;
        c = a;
        d = b;
        System.out.println("RectangleGlyph(), стороны: " + "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }

    @Override
    void draw() {
        System.out.println("Rectangle.draw(), стороны: " + "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}