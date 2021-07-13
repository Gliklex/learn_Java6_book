package zadanie12;

public class Adventure {
    public static void t(CanSwim x) {
        x.swim();
    }

    public static void u(CanFly x) {
        x.fly();
    }

    public static void v(CanFight x) {
        x.fight();
    }

    public static void m(CanClimb x) {
        x.clumb();
    }

    public static void n(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        m(hero);
        n(hero);
    }
}
