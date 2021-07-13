/* Объявите новый класс, производный от Detergent.
Переопределите метод scrub() и добавьте новый метод с именем sterilize().
 */

class Cleanser {
    private String s = "Cleanser";

    public void append(String а) {
        s += а;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class NewDeter extends Detergent {

    @Override
    public void scrub() {
        append(" NewDeter()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        NewDeter y = new NewDeter();
        y.dilute();
        y.apply();
        y.scrub();
        y.foam();
        y.sterilize();
        System.out.println(y);
    }
}

public class Detergent extends Cleanser {
    // Изменяем метод:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Вызываем метод базового класса
    }

    // Добавляем новые методы к интерфейсу:
    public void foam() {
        append(" foam()");
    }

    // Проверяем новый класс:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("проверяем базовый класс");
        Cleanser.main(args);
        System.out.println("проверяем производный класс");
        NewDeter.main(args);

    }
}

