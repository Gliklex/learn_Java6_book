package zadanie11;
/*
(4) Создайте класс с методом, который получает аргумент String
    и переставляет местами каждую пару символов в полученной строке.
    Адаптируйте класс так, чтобы он работал с interfaceprocessor.Apply.process().
    (сделано не правильно!)
 */
public class Movier implements Processor {
    public String name() {
        return "Movier";
    }

    public static String placer(String s) {
        char c[] = s.toCharArray();
        for(int i = 1; i < c.length; i = i + 2) {
            char temp = c[i-1];
            c[i-1] = c[i];
            c[i] = temp;
        }
        return new String(c);
    }

    public Object process(Object input) {
        return input;
    }

    public static void main(String[] args) {
        Apply.process(new Movier(), placer("Холостой"));
    }
}
