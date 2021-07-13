package zadanie12;
/*
(3) Измените упражнение так,
    чтобы программа демонстрировала порядок инициализации базовых и производных классов.
    Включите встроенные объекты и в базовые, и в производные классы, и покажите,
    в каком порядке проходит их инициализация при конструировании объекта.
 */

public class Frog extends Amphibian{
    private Characteristic a = new Characteristic("Живое существо");
    private Description b = new Description("Обычное живое существо");
    private Characteristic c = new Characteristic("Имеет сердце");
    private Description d = new Description("животное, не растение");
    private Characteristic i = new Characteristic("может жить в воде");
    private Description f = new Description("и в воде, и на земле");
    Frog() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose в Frog");
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Пока!");
        frog.dispose();
    }
}