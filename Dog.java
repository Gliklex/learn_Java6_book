public class Dog {
    void bark() {
        System.out.println("Гав!");
    }
    void bark(int i) {
        String s = "у";
        System.out.print("Где-то воет пёс: ");
        for (int j = 0; j < i; j++) {
            if (j > 0)
            System.out.print("-");
            System.out.print(s +"-"+ s.toUpperCase());
        }
        System.out.println();
    }
    void bark(double d) {
        System.out.println("Ну вот! В аргументе число с плавающей точкой, теперь пёс скулит, Вы довольны?");
        }
    void bark(int i, double d) {
        for (int j = 0; j < i; j++) {
            System.out.print("Гав! ");
        }
        System.out.println(d);
    }
    void bark(double d, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("Гав! ");
        }
        System.out.println(d);
    }
    public static void main(String[] args) {
        Dog Kashtanka = new Dog();
        Kashtanka.bark();
        Kashtanka.bark(13);
        Kashtanka.bark(2.2);
        Kashtanka.bark(2.2,13);
        Kashtanka.bark(13, 2.2);
        }
    }

