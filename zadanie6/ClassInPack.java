package zadanie6;
/*
(2) Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
Создайте класс в другом пакете. Добавьте защищенный внутренний класс, реализующий интерфейс.
В третьем пакете создайте производный класс;
внутри метода верните объект защищенного внутреннего класса, преобразованный в интерфейс.
 */

import zadanie6.packageUno.RealizeInterfacee;

public class ClassInPack {
    protected class InnerCls implements RealizeInterfacee {

        @Override
        public void method() {
            System.out.println("Interfacee.maethod() ");
        }
    }
}
