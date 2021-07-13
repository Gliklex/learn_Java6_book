package zadanie15;

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Создаем Description " + s);
    }

    protected void dispose() {
        System.out.println("завершаем Description " + s);
    }
}