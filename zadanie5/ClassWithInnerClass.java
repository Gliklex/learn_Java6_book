package zadanie5;
/*
(1) Создайте класс с внутренним классом. В отдельном классе создайте экземпляр внутреннего класса.
 */
public class ClassWithInnerClass {
    public class Inner {
        void p() {
            System.out.println("Внутренний класс");
        }
    }
}
