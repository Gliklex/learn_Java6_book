public class IfTest {
    static int a = 13;

    public static void main(String[] args) {
        if (a == 14){
            a -= 1;
            System.out.println(a);
        }
        else {
            System.out.println(a + 15);
        }
    }
}
