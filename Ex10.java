package operators.ex10;
// (3) Напишите программу с двумя константами: обе константы состоят из чередующихся нулей и единиц,
// но у одной нулю равен младший бит, а у другой старший
// (подсказка: константы проще всего определить в шестнадцатеричном виде).
// Объедините эти две константы всеми возможными поразрядными операторами.
// Для вывода результатов используйте метод Integer.toBinaryString().
public class Ex10 {
    static final int msb = 0x7;
    static final int lsb = 0xA;
    public static void main(String[] args) {
        System.out.println("msb: " + Integer.toBinaryString(msb));
        System.out.println("lsb: " + Integer.toBinaryString(lsb));
        System.out.println(Integer.toBinaryString(msb&lsb));
        System.out.println(Integer.toBinaryString(msb|lsb));
        System.out.println(Integer.toBinaryString(msb^lsb));
    }
}
