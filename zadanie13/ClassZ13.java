package zadanie13;
/*
(2) Создайте закрытый внутренний класс, реализующий открытый интерфейс.
    Напишите метод, который возвращает ссылку на экземпляр закрытого внутреннего класса,
    преобразованную к интерфейсу восходящим преобразованием.
    Чтобы показать, что внутренний класс полностью скрыт, попробуйте выполнить нисходящее преобразование к нему.
    (1) Повторите упражнение 9(у меня это 11) с анонимным внутренним классом.
 */

public class ClassZ13 {
    private OpenInterface closeClass() {
        return new OpenInterface() {
            @Override
            public void openInterfaceMethod() {
                System.out.println("closeClass");
            }
        };
    }
    OpenInterface returnLinkObjectCloseClass() {
        ClassZ13 z13 = new ClassZ13();
        return z13.closeClass();
    }
}
