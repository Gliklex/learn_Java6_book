package zadanie15;
/*
(2) Создайте класс, не содержащий конструктор по умолчанию (конструктор без аргументов).
 При этом класс должен содержать конструктор, получающий аргументы.
  Создайте второй класс с методом, который возвращает ссылку на объект первого класса.
   Возвращаемый объект должен создаваться посредством анонимного внутреннего класса, производного от первого.
 */

public class WithMethodReturnObject {
    WithOutDefaultConstructor returnLinkMethod() {
        return new WithOutDefaultConstructor("Медвед") {
        };
    }

    public static void main(String[] args) {
        new WithMethodReturnObject().returnLinkMethod();
    }
}
