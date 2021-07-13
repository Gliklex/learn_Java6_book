/* (2) Создайте класс с полями и методами, обладающими разными уровнями доступа:
    public, private, protected, доступом в пределах пакета.
    Создайте объект этого класса и посмотрите,
    какие сообщения выдает компилятор при попытке обращения к разным членам класса.
    Учтите, что классы, находящиеся в одном каталоге, входят в «пакет по умолчанию».
 */
import moretest.ClassMore;
public class ClassMoreTest extends ClassMore{
    public static void main(String[] args) {
        ClassMoreTest cMT = new ClassMoreTest();
        //cM.j = 10;
        cMT.pi = 23;
        //cM.inter();
        cMT.pinter();
        cMT.protecter();
       // cM.privater();
    }
}