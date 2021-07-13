package zadanie20;
/*
(1) Создайте интерфейс, содержащий вложенный класс. Реализуйте интерфейс и создайте экземпляр вложенного класса.
 */

public interface Zadanie20 {
    void method();

    class InZadanie20 implements Zadanie20 {
        @Override
        public void method() {
            System.out.println("InZadanie20.method() ");
        }

        public static void main(String[] args) {
            InZadanie20 inZadanie20 = new InZadanie20();
            inZadanie20.method();
        }
    }

}
