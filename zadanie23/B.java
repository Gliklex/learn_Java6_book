package zadanie23;

/*
(4) Создайте интерфейс и с тремя методами.
 Создайте класс А с методом, который создает ссылку на U посредством построения анонимного внутреннего класса.
  Создайте второй класс В, который содержит массив U.
  Класс в содержит один метод, который получает и сохраняет ссылку на U в массиве;
  второй метод, который сбрасывает ссылку в массиве (определяемую аргументом метода) в состояние null;
   и третий метод, который перебирает элементы массива и вызывает методы U.
   В методе main() создайте группу объектов А и один объект B.
   Заполните объект B ссылками U, произведенными объектами А.
   Используйте B для выполнения обратных вызовов по всем объектам А.
   Удалите некоторые ссылки на U из B.
 */

class B {
    private final U[] mass;
    private int i;

    public B(int size) {
        mass = new U[size];
    }

    void methodSaveLink(U u) {
        mass[i] = u;
        i++;

    }

    void resetLink(U u) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == u) {
                mass[i] = null;
            }
        }
    }

    void call() {
        for (U u : mass) {
            if (u != null) {
                u.methodUno();
                u.methodDos();
                u.methodTres();
            }
        }
    }

    public static void main(String[] args) {
        B b = new B(3);
        A a1 = new A("a1");
        A a2 = new A("a2");
        b.methodSaveLink(a1.methodRetU());
        b.methodSaveLink(a2.methodRetU());
        b.methodSaveLink(a2.methodRetU());
        b.call();
        b.resetLink(b.mass[1]);
        b.call();
    }
}
