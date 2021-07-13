package zadanie5;

public class OutClass {
    public static void main(String[] args) {
        ClassWithInnerClass cWIC = new ClassWithInnerClass();
        ClassWithInnerClass.Inner cWICI = cWIC.new Inner();
        cWICI.p();
    }
}
