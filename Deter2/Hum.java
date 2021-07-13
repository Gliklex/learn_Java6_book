package Deter2;
/*Создайте класс в пакете. Ваш класс должен содержать метод со спецификатором protected.
Попытайтесь вызвать метод protected за пределами пакета, и объясните, что происходит.
Затем создайте класс, производный от вашего, и вызовите метод protected из другого метода вашего производного класса.
 */

public class Hum {
    protected void jogging() {
        System.out.println("Побежал трусцой");
    }
}
class Man extends Hum{
    private String name;
    private int age;
    private char sex = 'M';
    Man(String s, int i) {
        name = s;
        age = i;
    }
    void start() {
        System.out.println("Возраст: " + age + "\nИмя: " + name);
        super.jogging();
    }

    public static void main(String[] args) {
        Man vovan = new Man("Вован", 24);
        vovan.start();
    }
}
