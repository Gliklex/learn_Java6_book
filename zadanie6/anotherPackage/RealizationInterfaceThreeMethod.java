package zadanie6.anotherPackage;

import zadanie6.InterfaceThreeMethod;

public class RealizationInterfaceThreeMethod implements InterfaceThreeMethod {
    @Override
    public void methodUno() {
        System.out.println("methodUno() ");
    }

    @Override
    public void methodDos() {
        System.out.println("methodDos() ");
    }

    @Override
    public void methodTres() {
        System.out.println("methodTres() ");
    }

    public static void main(String[] args) {
        RealizationInterfaceThreeMethod rITM = new RealizationInterfaceThreeMethod();
        rITM.methodUno();
        rITM.methodDos();
        rITM.methodTres();

        InterfaceThreeMethod iTM = new RealizationInterfaceThreeMethod();
        iTM.methodUno();
        iTM.methodDos();
        iTM.methodTres();
    }
}
