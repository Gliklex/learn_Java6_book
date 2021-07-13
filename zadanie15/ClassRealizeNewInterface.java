package zadanie15;
/* (2) Измените предыдущее упражнение — создайте абстрактный класс и унаследуйте производный класс от него.
 */

public class ClassRealizeNewInterface extends AbstractClass implements Inter4 {
    @Override
    public void methodAbstractClass() {
        System.out.println("methodAbstractClass() ");
    }

    @Override
    public void inter2Method1() {
        System.out.println("ClassRealizeNewInterface.inter2Method1() ");
    }

    @Override
    public void inter2Method2() {
        System.out.println("ClassRealizeNewInterface.inter2Method2() ");
    }

    @Override
    public void inter3Method1() {
        System.out.println("ClassRealizeNewInterface.inter3Method1() ");
    }

    @Override
    public void inter3Method2() {
        System.out.println("ClassRealizeNewInterface.inter3Method2() ");
    }

    @Override
    public void inter4NewMethod() {
        System.out.println("ClassRealizeNewInterface.inter4NewMethod() ");
    }

    static void method1(Inter1 a) {
        a.inter1Method1();
        a.inter1Method2();
        System.out.println("ClassRealizeNewInterface.method1() ");
    }

    static void method2(Inter2 b) {
        b.inter2Method1();
        b.inter2Method2();
        System.out.println("ClassRealizeNewInterface.method2() ");
    }

    static void method3(Inter3 c) {
        c.inter3Method1();
        c.inter3Method2();
        System.out.println("ClassRealizeNewInterface.method3() ");
    }

    static void method4(Inter4 d) {
        d.inter4NewMethod();
        System.out.println("ClassRealizeNewInterface.method4() ");
    }

    public static void main(String[] args) {
        ClassRealizeNewInterface bC = new ClassRealizeNewInterface();
        method1(bC);
        method2(bC);
        method3(bC);
        method4(bC);
    }
}

