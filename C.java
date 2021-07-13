class A {
    A() {
        System.out.println( "Конструктор А");
    }
}

class B {
    B() {
        System.out.println("Конструктор Б");
    }
    public String toString() {
        return "Строковое представление класса Б";
    }
}

public class C extends A {
    B typeB = new B();


    public static void main(String[] args) {

        C objectC = new C();
    }
}
