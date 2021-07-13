package zadanie3;
/*
(1) Измените упражнение 1 так, чтобы класс Outer содержал закрытое поле String (инициализируемое в конструкторе),
а класс Inner содержал метод toString() для вывода этого поля. Создайте объект типа Inner и выведите его.
 */

public class Outer {
    private String str;

    Outer(String str) {
        this.str = str;
    }

    class Inner {
        @Override
        public String toString() {
            return str;
        }
    }

    Inner to() {
        return new Inner();
    }

    static class StaticInner {
    }

    public static void main(String[] args) {
        Outer p = new Outer("Пропасть");
        Outer o = new Outer("А это не пропасть");
        Inner i2 = p.to();
        Inner i = o.to();
        System.out.println("Это" + " " + i2);
        System.out.println(i);
        new Outer.StaticInner();
        //new Outer.Inner();

    }
}
