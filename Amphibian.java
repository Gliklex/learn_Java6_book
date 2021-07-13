/* (2) Создайте класс с именем Amphibian. Объявите производный от него класс с именем Frog.
    Разместите в базовом классе несколько методов.
    В методе main() создайте объект Frog, преобразуйте его в Amphibian и продемонстрируйте, что все методы работают.

    Измените упражнение так, чтобы класс Frog переопределял методы базового класса
    (предоставляя новые определения с той же сигнатурой метода).
    Посмотрите, что произойдет в методе main().
 */
class Frog extends Amphibian{

    @Override
    public void swim() {
        System.out.println("Поплыли");
    }
}

public class Amphibian {
    public void swim() {}
    static void walk(Amphibian a) {
        System.out.println("вышла на берег");
    }

    public static void main(String[] args) {
        Amphibian kvakusha = new Frog();
        Amphibian.walk(kvakusha);
        Frog.walk(kvakusha);
        kvakusha.swim();
    }
}
