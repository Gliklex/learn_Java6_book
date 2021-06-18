public class Finalizer {
    boolean checkIt;
    Finalizer(boolean check) {
        checkIt = check;
    }
    void checkItTrue(){
        checkIt = false;
    }
    @Override
    public void finalize() {
        if (checkIt)
            System.out.println("Обьект не готов к уборке");
    }
    public static void main(String[] args) {
        Finalizer fizer = new Finalizer(true);
        fizer.checkItTrue();
        new Finalizer(true);
        System.gc();
    }
}
