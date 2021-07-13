package zadanie16;

/*
(4) Создайте класс с методом, который получает аргумент String
    и переставляет местами каждую пару символов в полученной строке.
    Адаптируйте класс так, чтобы он работал с interfaceprocessor.Apply.process().
    (1) Измените решение упражнения 11 из главы 9 так, чтобы в нем использовались анонимные внутренние классы.
 */
public class Movier {
    public static Processor processor() {
        return new Processor() {
            @Override
            public String name() {
                return "Movier";
            }

            @Override
            public Object process(Object input) {
                return  input;
            }
        };
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

    public static void main(String[] args) {
        Apply.process(Movier.processor(), placer("Холостой"));
    }
}
