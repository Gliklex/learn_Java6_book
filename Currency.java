/*  Создайте перечисление с названиями шести типов бумажных денег.
    Переберите результат values() с выводом каждого значения и его ordinal().

    Напишите команду switch для перечисления из предыдущего примера.
    Для каждого случая выведите расширенное описание конкретной валюты.
 */

public class Currency {
    public enum Currens {
        RUB, BYN, CNY, KPV, EUR, USD
    }
        Currens coin;
        public Currency(Currens coin) { this.coin = coin;}
        public void From() {
            System.out.print("Эта монетка из: ");
            switch(coin) {
                case RUB: System.out.print("России\n"); break;
                case BYN: System.out.print("Беларусии\n"); break;
                case CNY: System.out.print("Китая\n"); break;
                case KPV: System.out.print("КНДР\n"); break;
                case EUR: System.out.print("Европы\n"); break;
                case USD: System.out.print("США\n"); break;
            }

        }
    public static void main(String[] args) {
        for (Currens c: Currens.values()) {
            System.out.println(c + ", ordinal " + c.ordinal());
        }
            Currency
                    rub = new Currency(Currens.RUB),
                    bel = new Currency(Currens.BYN),
                    chi = new Currency(Currens.CNY),
                    kNDR = new Currency(Currens.KPV),
                    Euro = new Currency(Currens.EUR),
                    Doll = new Currency(Currens.USD);
            rub.From();
            bel.From();
            chi.From();
            kNDR.From();
            Euro.From();
            Doll.From();
        }
    }
