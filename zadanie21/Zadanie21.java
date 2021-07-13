package zadanie21;
/*
(2) Создайте интерфейс с вложенным классом, содержащим статический метод,
 который вызывает методы вашего интерфейса и выводит результаты.
 Реализуйте интерфейс и передайте экземпляр своей реализации методу.
 */

public interface Zadanie21 {
    void method();

    class InZadanie21 {
        static Zadanie21 staticMethod() {
            return new Zadanie21() {
                @Override
                public void method() {
                    System.out.println("method");
                }
            };
        }

        public static void main(String[] args) {
            staticMethod().method();
        }
    }
}
