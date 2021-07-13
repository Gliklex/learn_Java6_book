package zadanie15;

class Animal extends LivingCreature {
    private Characteristic a = new Characteristic("Живое существо");
    private Description b = new Description("Обычное живое существо");
    private Characteristic c = new Characteristic("Имеет сердце");
    private Description d = new Description("животное, не растение");
    private Characteristic i = new Characteristic("может жить в воде");
    private Description f = new Description("и в воде, и на земле");
    Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose в Animal");
        super.dispose();
    }
}