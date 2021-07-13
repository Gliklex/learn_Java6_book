package zadanie14;
/*(3) Включите метод finalize() в ReferenceCounting.java, чтобы проверить условие завершения (см. главу 5).
 */

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };

        for(Composing c: composing) {
            c.dispose();
        }
        shared = null;
        composing = null;
        System.gc();
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
