package Deter2;
/* Измените пример Detergent. java так, чтобы в нем использовалось делегирование.
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

public class DetergentD{

    private Cleanser cleaner = new Cleanser();

    public void dilute() {
        cleaner.dilute();
    }

    public void apply() {
        cleaner.apply();
    }

    public void scrub() {
        cleaner.scrub();
        //super.scrub(); // Вызываем метод базового класса
    }

    // Добавляем новые методы к интерфейсу:
    public void foam() {

        cleaner.append(" foam()");
    }

    @Override
    public String toString() {
        return cleaner.toString();
    }

    // Проверяем новый класс:
    public static void main(String[] args) {
        DetergentD x = new DetergentD();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("проверяем базовый класс");
        Cleanser.main(args);
    }
}