package zadanie7_8;
/*
(2) Создайте класс, содержащий закрытое поле и закрытый метод.
Создайте внутренний класс с методом, который изменяет поле внешнего класса и вызывает метод внешнего класса.
Во втором методе внешнего класса создайте объект внутреннего класса и вызовите его метод; продемонстрируйте эффект на объекте внешнего класса.
 (2) Проверьте, доступны ли для внешнего класса закрытые элементы внутреннего класса.
 */

public class CloseClass {
    private int pole = 12;

    private void method() {
        System.out.println("CloseClass.method ()");
    }

    class InCloseClass {
        private int closePole;

        private void p() {
            pole = 23;
            method();
        }
    }

    public void create() {
        InCloseClass inCloseClass = new InCloseClass();
        inCloseClass.closePole = 10;
        inCloseClass.p();
    }

    public static void main(String[] args) {
        CloseClass closeClass = new CloseClass();
        System.out.println(closeClass.pole);
        closeClass.create();
        System.out.println(closeClass.pole);
    }
}
