package zadanie14;

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    protected void finalize() {
        System.out.println("Объект Composing готов к удалению ");
    }

    public String toString() {
        return "Composing " + id;
    }
}
