package zadanie9;

/*(1) Создайте интерфейс, содержащий минимум один метод. Реализуйте его,
 определяя внутренний класс в методе, который возвращает ссылку на ваш интерфейс.
 */

public class TestClass {

    public TestInterface classMethod() {
       return new TestInterface() {

           @Override
           public void method() {
               class InClass implements TestInterface {
                   void print() {
                       System.out.println("InClass.print() ");
                   }

                   @Override
                   public void method() {

                   }
               }

               InClass iC = new InClass();
               iC.print();
           }
       };
   }

    public static void main(String[] args) {
        TestClass c = new TestClass();
        c.classMethod().method();
    }
}
