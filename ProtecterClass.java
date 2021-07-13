/* Создайте класс с защищенными данными.
   Создайте в том же файле второй класс с методом, работающим с защищенными данными из первого класса.
 */
public class ProtecterClass {
    protected int pi = 38;

    protected void birds() {
        System.out.print("Попугаев ");
    }

    public static void main(String[] args) {
        HowMuch hM = new HowMuch();
        hM.howMuch();
    }

}
class HowMuch {
    ProtecterClass pC = new ProtecterClass();

    void howMuch() {
        System.out.println("Сколько попугаев?");
        pC.birds();
        System.out.println(pC.pi);
    }
}


