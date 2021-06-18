/*(2) Создайте класс с конструктором, получающим аргумент String.
      Выведите значение аргумента во время конструирования.
      Создайте массив ссылок на этот класс, но не создавайте объекты, которыми заполняется массив.
      Запустите программу и посмотрите, будут ли выводиться сообщения при вызове конструкторов.
  (1) Завершите предыдущее упражнение — создайте объекты, которыми заполняется массив ссылок.*/
public class GetArgString {
    public GetArgString(String sArg){
        System.out.println(sArg);
    }

    public static void main(String[] args) {
        new GetArgString("Обложка");
        GetArgString[] MasLinks = new GetArgString[]{
            new GetArgString("Отражение"),
            new GetArgString("Скума"),
            new GetArgString("Лунный сахар"),
        };
    }
}


