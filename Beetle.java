/*(2) В файле Beetle.java создайте еще один тип, производный от Beetle, в таком же формате, как и у других классов.
Проследите за работой программы и объясните результат.
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("none static Insect.x1 инициализировано");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
class Titanus extends Beetle {
    private int l = printInit("none Tittanus.l инициализировано");

    public Titanus() {
        System.out.println("Конструктор Titanus");
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }

    private static int x3 =
            printInit("none static Titanus.x3 инициализировано");
}

public class Beetle extends Insect {
    private int k = printInit("none Beetle.k инициализировано");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
}
    private static int x2 =
            printInit("none static Beetle.x2 инициализировано");

    public static void main(String[] args) {
        System.out.println("конструктор Beetle");
        Beetle b = new Beetle();
        Titanus t = new Titanus();
    }
}
