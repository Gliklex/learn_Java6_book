package zadanie2;

public class Shapes {
    private static RndShapeGen gen = new RndShapeGen();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
