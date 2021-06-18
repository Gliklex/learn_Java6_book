public class ConstructorOverload {
    public ConstructorOverload() {
        this("Default", 0);
    }

    public ConstructorOverload(String s, int i) {
        System.out.println(s +", " + i);
    }

    public static void main(String[] args) {
        ConstructorOverload cO = new ConstructorOverload();
    }
}