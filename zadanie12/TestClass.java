package zadanie12;

/*(1) Создайте интерфейс, содержащий минимум один метод. Реализуйте его,
 определяя внутренний класс в методе, который возвращает ссылку на ваш интерфейс.
 (1) Повторите упражнение 7(у меня это 9) с анонимным внутренним классом.
 */

import java.io.Serializable;

public class TestClass {
    interface NewInterface extends TestInterface, Serializable {}
    public TestInterface methodTwo() {
        return new NewInterface() {
            @Override
            public void method() {
            }
        };
    }

    public static void main(String[] args) {
        TestClass tC = new TestClass();
        System.out.println(tC.methodTwo().getClass());
    }
}
