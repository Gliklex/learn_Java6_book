package zadanie14;
/*
(1) Измените пример interfaces/HorrorShow.java, реализовав DangerousMonster и Vampire как анонимные классы.
 */

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla().danger();
        u(barney);
        v(barney);

        VeryBadVampire vladChocolacula = new VeryBadVampire();
        u(vladChocolacula.vamp());
        v(vladChocolacula.vamp());
        w(vladChocolacula.vamp());
    }
}
