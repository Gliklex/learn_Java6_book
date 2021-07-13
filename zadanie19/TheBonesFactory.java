package zadanie19;

public class TheBonesFactory implements GameFactory {
    @Override
    public Game checkResult() {
        return new TheBones();
    }
}
