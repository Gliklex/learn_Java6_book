package zadanie11;
/*
(2) Создайте закрытый внутренний класс, реализующий открытый интерфейс.
    Напишите метод, который возвращает ссылку на экземпляр закрытого внутреннего класса,
    преобразованную к интерфейсу восходящим преобразованием.
    Чтобы показать, что внутренний класс полностью скрыт, попробуйте выполнить нисходящее преобразование к нему.
 */

public class ClassZ11 {
    private static class CloseClass implements OpenInterface {
        @Override
        public void openInterfaceMethod() {
            System.out.println("CloseClass.openInterfaceMethod() ");
        }
    }
    OpenInterface returnLinkObjectCloseClass() {
        return new CloseClass();
    }
}
