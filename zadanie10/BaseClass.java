package zadanie10;

public class BaseClass {
    void methodOne() {
        methodTwo();
    }
    void methodTwo() {
        System.out.println("BaseClass.methodTwo() ");
    }
}
