package zadanie4;
/*
Добавьте новый подтип Shape к программе Shapes.java и проверьте на методе main(),
что полиморфизм работает правильно для вашего нового типа, так же как и для старых типов.
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
        }
    }
}
