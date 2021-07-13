package zadanie19;

public class TheEgletFactory implements GameFactory {
    @Override
    public Game checkResult() {
        return new TheEglet();
    }
}
