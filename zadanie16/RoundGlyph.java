package zadanie16;

public class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
