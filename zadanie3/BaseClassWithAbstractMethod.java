package zadanie3;
/*
(2) Создайте базовый класс с определением метода abstract print(),
переопределяемого производными классами. Переопределенная версия методавыводит значение переменной int,
 определенной в производном классе. В точке определения этой переменной присвойте ей ненулевое значение.
 Вызовите этот метод в конструкторе базового класса. В методе main() создайте объект производного типа,
 а затем вызовите его метод print(). Объясните результат работы программы.
 */
public abstract class BaseClassWithAbstractMethod {
    abstract void paint();

     BaseClassWithAbstractMethod() {
        paint();
    }
}
