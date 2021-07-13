package Deter2;
class Component {
    Component(int i) {
        System.out.println("Конструктор класса Component с числовым аргументом: " + i);
    }
    void dispose() {
        System.out.println("Завершение Component");}

}
class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root(int i) {
        System.out.println("Конструктор класса Root с числовым аргументом: " + i);
        c1 = new Component1(1);
        c2 = new Component2(2);
        c3 = new Component3(3);
    }
    void dispose() {
    c3.dispose();
    c2.dispose();
    c1.dispose();
    System.out.println("Завершение Root");
    }
}

class Component1 extends Component {
    Component1(int i) {
        super(i);
        System.out.println("Конструктор класса Component1 с числовым аргументом: " + i);
    }

    @Override
    void dispose() {
        System.out.println("Завершение Component1");
        super.dispose();
    }

}

class Component2 extends Component{
    Component2(int i) {
        super(i);
        System.out.println("Конструктор класса Component2 с числовым аргументом: " + i);
    }

    @Override
    void dispose() {
        System.out.println("Завершение Component2");
        super.dispose();
    }
}

class Component3 extends Component{
    Component3(int i) {
        super(i);
        System.out.println("Конструктор класса Component3 с числовым аргументом: " + i);
    }

    @Override
    void dispose() {
        System.out.println("Завершение Component3");
        super.dispose();
    }
}

public class Stem2 extends Root {
    Component1 c4 ;
    Component2 c5 ;
    Component3 c6 ;

    Stem2(int b) {
        super(b);
        c4 = new Component1(4);
        c5 = new Component2(5);
        c6 = new Component3(6);
        System.out.println("Конструктор класса Stem2 с числовым аргументом: " + b);
    }

    @Override
    void dispose() {
        System.out.println("Stem2.dispose()");
        c6.dispose();
        c5.dispose();
        c4.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Stem2 s = new Stem2(9);
        s.dispose();
    }
}