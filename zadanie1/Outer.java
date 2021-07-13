package zadanie1;
/*
(1) Напишите класс с именем 0uter, содержащий внутренний класс с именем lnner.
Добавьте в 0uter метод, возвращающий объект типа Inner.
В методе main() создайте и инициализируйте ссылку на lnner.
 */

public class Outer {

   class Inner {
       Inner() {
           print();
       }

       void print() {
           System.out.println("Inner.print");
       }
   }
   Inner to() {
       return new Inner();
   }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.to();

    }
}
