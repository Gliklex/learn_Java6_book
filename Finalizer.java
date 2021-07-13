/*  20. Продемонстрируйте, что аннотация @Override решает проблему, упомянутую в этом разделе.
    21. Создайте класс с неизменным (final) методом.
        Создайте производный класс и попытайтесь переопределить этот метод.
 */

public class Finalizer {
    private int i;
    private void Keybd() {
        System.out.println("Keybd()");
    }
    final void Printer() {
        System.out.println(i);
    }
    public Finalizer() {
        i = 123;
        Printer();
        Keybd();
    }

    public static void main(String[] args) {
        ExtendFinalizer eF = new ExtendFinalizer();
    }
}

class ExtendFinalizer extends Finalizer {
    private int j = 1232;

    //@Override
    private void Keybd(){}
    //final void Printer() {}

    ExtendFinalizer() {

    }
}

