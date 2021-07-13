package zadanie12;

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("завершаем Characteristic " + s);
    }
}
