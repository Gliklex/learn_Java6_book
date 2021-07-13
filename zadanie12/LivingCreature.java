package zadanie12;

class LivingCreature {
    private Characteristic a = new Characteristic("Живое существо");
    private Description b = new Description("Обычное живое существо");
    private Characteristic c = new Characteristic("Имеет сердце");
    private Description d = new Description("животное, не растение");
    private Characteristic i = new Characteristic("может жить в воде");
    private Description f = new Description("и в воде, и на земле");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("dispose в LivingCreature");
        f.dispose();
        i.dispose();
        d.dispose();
        c.dispose();
        b.dispose();
        a.dispose();
    }
}
