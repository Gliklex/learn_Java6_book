package zadanie7;

class Hamster implements Rodent {
    @Override
    public void bite() {
        System.out.println("Hamster.bite() ");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
