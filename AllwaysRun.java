class Prnt {
    Prnt() {
        System.out.println("Конструктор родительский");
    }
}
class Dghtr extends Parent{
    Dghtr() {
        System.out.println("Конструктор дочерний");
    }
}
public class AllwaysRun extends Dghtr{
    String bomjur = "Привед!";
    void sayBomjur() {
        System.out.println(bomjur);
    }
    AllwaysRun() {
        System.out.println("Конструктор Allways");
    }

    public static void main(String[] args) {
        new AllwaysRun().sayBomjur();

    }
}
