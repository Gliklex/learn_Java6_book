package zadanie16;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw() ");
    }
    Glyph() {
        System.out.println("перед вызовом Glyph.draw()");
        draw();
        System.out.println("после вызовова Glyph.draw()");
    }
}
