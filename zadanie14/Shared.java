package zadanie14;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Создаем " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if(--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    protected void finalize() {
        System.out.println("Объект Shared готов к удалению ");
    }

    public String toString() {
        return "Shared " + id;
    }
}
