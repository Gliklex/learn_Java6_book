package zadanie17;
/* 17. (3) По образцу Transmogrify.java создайте класс starship со ссылкой на объект Alertstatus,
 который может обозначать одно из трех состояний. Включите методы для изменения состояния.
 */

public class StarShip {
    public static void main(String[] args) {
        AlertStatus alertStatus = new AlertStatus();
        alertStatus.checkStatus();
        alertStatus.change(2);
        alertStatus.checkStatus();
        alertStatus.change(3);
        alertStatus.checkStatus();
        alertStatus.change(1);
        alertStatus.checkStatus();
    }
}
