package moretest;

/* (2) Создайте класс с полями и методами, обладающими разными уровнями доступа:
    public, private, protected, доступом в пределах пакета.
    Создайте объект этого класса и посмотрите,
    какие сообщения выдает компилятор при попытке обращения к разным членам класса.
    Учтите, что классы, находящиеся в одном каталоге, входят в «пакет по умолчанию».
 */
public class ClassMore {
    int j = 10;
    public int pi;
    protected String ps = "Протектед";
    private String spre = "Приват :)";

    void inter(){
        System.out.println(j);
    }
    public void pinter(){
        System.out.println("метод pinter " + pi);
    }
    private void privater(){
        System.out.println("Метод privater " + ps);
    }
    protected void protecter(){
        System.out.println("Метод protecter " + spre);
    }
}

