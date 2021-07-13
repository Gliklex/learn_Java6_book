/* Создайте два пакета debug и debugoff,
   содержащие одинаковые классы с методом debug().
   Первая версия выводит на консоль свой аргумент типа String,
   вторая не делает ничего.
   Используйте директиву static import для импортирования класса в тестовую программу
   и продемонстрируйте эффект условной компиляции.
 */

import static debug.DeBro.*;
import static debugoff.DeBro.*;
public class TestBugDeBugoff {
    public static void main(String[] args) {
        debug("привет");
        debug();
    }

}
