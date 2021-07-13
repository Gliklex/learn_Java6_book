package zadanie4;

class ChildClass extends AbstractClassWithOutMethods{

    void print() {
        System.out.println("ChildClass.print() ");
    }
    public static AbstractClassWithOutMethods staticMethod() {
        return new ChildClass();
    }

    public static void main(String[] args) {
        AbstractClassWithOutMethods aCWOM = staticMethod();
        ((ChildClass) aCWOM).print();
    }
}
