package zadanie15;

class Characteristic {
    private static long counter = 0;
    private final long id = counter++;
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Characteristic " + s + " " + id);
    }

    protected void dispose() {
        System.out.println("завершаем Characteristic " + s + " " + id);
    }
}
