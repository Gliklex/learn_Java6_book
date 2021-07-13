package zadanie19;
/*
2) Создайте класс, содержащий внутренний класс, который, в свою очередь, содержит внутренний класс.
 Повторите управление с вложенными классами. Обратите внимание на имена файлов .class, создаваемых компилятором.
 */

public class Zadanie19 {
    static class InZadanie19 {
        static class InInZadanir19 {
        }
    }

    public static void main(String[] args) {
        Zadanie19 zadanie19 = new Zadanie19();
        InZadanie19 inZadanie19 = new InZadanie19();
        InZadanie19.InInZadanir19 inInZadanir19 = new InZadanie19.InInZadanir19();
    }
}
