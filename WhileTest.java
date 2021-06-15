public class WhileTest {
    static boolean cond(){
        boolean result = Math.random() < 0.99;
        System.out.println(result+", ");
        return result;
    }

    public static void main(String[] args) {
        /*do {
            System.out.println("собщение: ");
            System.out.println("повтор цикла");
        }
        while (cond());
        System.out.println("собщение: \n"+"цикл завершен!");*/
        while (cond()){
            System.out.println("собщение: ");
            System.out.println("повтор цикла");
        }
        System.out.println("собщение: \n"+"цикл завершен!");
    }
}
