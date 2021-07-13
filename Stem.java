class Root {
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    Root(int i) {
        System.out.println("Конструктор класса Root с числовым аргументом: " + i);
    }
}

class Component1 {
    Component1(int j) {
        System.out.println("Конструктор класса Component1 с числовым аргументом: " + j);
    }
}

class Component2 {
    Component2(int h) {
        System.out.println("Конструктор класса Component2с числовым аргументом: " + h);
    }
}

class Component3 {
    Component3(int z) {
        System.out.println("Конструктор класса Component3с числовым аргументом: " + z);
    }
}

public class Stem extends Root{
    Component1 c4 = new Component1(4);
    Component2 c5 = new Component2(5);
    Component3 c6 = new Component3(6);

    Stem(int b) {
        super(8);
        System.out.println("Конструктор класса Stem с числовым аргументом:" + b);
    }

    public static void main(String[] args) {
        Stem s = new Stem(9);
    }
}
