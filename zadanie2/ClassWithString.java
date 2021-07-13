package zadanie2;
/*
(2) Создайте класс, который содержит String и метод toString() для вывода хранимой строки.
Добавьте несколько экземпляров нового класса в объект Sequence и выведите их.
 */

public class ClassWithString {
    private String str = "Околоток";

    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(2);
        for(int i = 0; i < 2; i++) {
            sequence.add(new ClassWithString());
        }
        Selector select = sequence.selector();
        while(!select.end()) {
            System.out.print(select.current() + " ");
            select.next();
        }
    }
}
