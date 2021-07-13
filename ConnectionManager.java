/*(4) По образцу примера Lunch.java создайте класс с именем ConnectionManager,
который управляет фиксированным массивом объектов Connection.
Программист- клиент не должен напрямую создавать объекты Connection,
а может получать их только с помощью статического метода в классе ConnectionManager.
Когда запас объектов у класса ConnectionManager будет исчерпан, он должен вернуть ссылку null.
Протестируйте классы в методе main().!!!!!!!!!!!!!!
 */
// реализовать! Должен
    class Connection {

        Connection() {
        }
    }

    public class ConnectionManager {
        private static Connection[] fixMass = new Connection[] { new Connection(), new Connection(), new Connection()};
        private static int iter = -1;

        static Connection getConnection() {
            iter++;
            if (iter < fixMass.length){
                return fixMass[iter];
            } else {
                return null;
            }
        }

        public static void main(String[] args) {
            System.out.println(ConnectionManager.getConnection() == null); //false
            System.out.println(ConnectionManager.getConnection() == null); //false
            System.out.println(ConnectionManager.getConnection() == null); //false
            System.out.println(ConnectionManager.getConnection() == null); //True
        }
}
