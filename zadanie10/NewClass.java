package zadanie10;

/*(1) Повторите предыдущее упражнение, но определите внутренний класс в области действия внутри метода.
 */


public class NewClass {

    public NewInterface2 classMethod() {

       class InMethodClass implements NewInterface2 {

           @Override
           public void method() {
               System.out.println("classMethod_InMethodClass.method() ");
           }
       }
       return new InMethodClass();
   }

    public static void main(String[] args) {
        NewClass c = new NewClass();
        c.classMethod().method();
    }
}
