/* 2) Создайте класс, содержащий два поля: static final и final. Продемонстрируйте различия между ними. */

import java.util.*;

public class StaticFinalAndFinal {
    private static Random rand = new Random(47);
    private static final int J = rand.nextInt(20);
    private final int i = rand.nextInt(20);
    public String toString() {
        return J + " = J\n" + i + " = i";
    }
    public static void main(String[] args) {
        StaticFinalAndFinal sFAF = new StaticFinalAndFinal();
        StaticFinalAndFinal sFAF2 = new StaticFinalAndFinal();
        System.out.println(sFAF);
        System.out.println(sFAF2);
    }
}
