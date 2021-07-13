/* Создайте простой класс. Во втором классе определите ссылку на объект первого класса.
Используйте отложенную инициализацию для создания экземпляров этого класса.
 */

class ToInit {
    private String tI;

    ToInit(String s) {
        tI = s;
        hello();
    }

    String hello() {
        return "Привет" + " " + tI;
    }

    public String toString() {
        return tI;
    }
}

public class LazyInit {
    static LazyInit li;
    private ToInit iT = new ToInit("Медвед");

    public String toString() {
        return "Большой" + " " + iT.hello();
    }

    public static void main(String[] args) {
        li = new LazyInit();
        System.out.println(li);
    }
}
