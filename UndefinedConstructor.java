class Parent {
    Parent() {
        System.out.println("Конструктор родительский");
    }
}
class Daughter extends Parent{
    Daughter() {
        System.out.println("Конструктор дочерний");
    }
}
public class UndefinedConstructor extends Daughter{
    public static void main(String[] args) {
        UndefinedConstructor uC = new UndefinedConstructor();
    }
}
