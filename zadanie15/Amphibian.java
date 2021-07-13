package zadanie15;

class Amphibian extends Animal {
    private Characteristic a = new Characteristic("Живое существо");
    private Description b = new Description("Обычное живое существо");
    private Characteristic c = new Characteristic("Имеет сердце");
    private Description d = new Description("животное, не растение");
    private Characteristic i = new Characteristic("может жить в воде");
    private Description f = new Description("и в воде, и на земле");
    Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose в Amphibian");
        super.dispose();
    }
}