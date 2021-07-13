class Uno {
    Uno(int chislo) {
        int result = chislo * 5;
        System.out.println("Результат: " + result);
    }
}
public class DerivativeClass extends Uno{
    DerivativeClass(String stroka) {
        super(5);
        System.out.println("Конструктор класса DerivativeClass с строковым аргументом: " + stroka);
    }
    DerivativeClass() {
        super(8);
        System.out.println("Конструктор класса DerivativeClass по умолчанию");
    }

    public static void main(String[] args) {
        DerivativeClass dC2 = new DerivativeClass("Морда\n");
        DerivativeClass dC = new DerivativeClass();
    }
}
