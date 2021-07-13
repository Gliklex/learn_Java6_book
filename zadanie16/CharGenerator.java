package zadanie16;
import java.nio.*;
import java.util.*;

/* Создайте класс, который генерирует серию char.
Адаптируйте его так, чтобы он мог использоваться для передачи данных Scanner.
 !(несовсем понял задание, интерфейс Readbele расспросить про него)*/

public class CharGenerator implements Readable{
    private static Random rand = new Random(47);

    public static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private int count;

    public CharGenerator(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if(count-- == 0) {
            return -1;
        }

        cb.append(capitals[rand.nextInt(capitals.length)]);

        for(int i = 0; i < 4; i++) {
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }

        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new CharGenerator(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
