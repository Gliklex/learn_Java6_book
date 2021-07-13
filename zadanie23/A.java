package zadanie23;

import java.util.Random;

public class A {
    private final Random random = new Random();
    private final String stroka;

    public A(String stoka) {
        this.stroka = stoka;
    }

    U methodRetU() {
        final int x = random.nextInt();
        return new U() {
            @Override
            public void methodUno() {
                System.out.println(A.this.stroka + ".methodUno(" + x + ")");

            }

            @Override
            public void methodDos() {
                System.out.println(A.this.stroka + ".methodDos()");
            }

            @Override
            public void methodTres() {
                System.out.println(A.this.stroka + ".methodTres()");
            }
        };
    }
}
