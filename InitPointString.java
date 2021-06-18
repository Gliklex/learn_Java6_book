class Gen{
    Gen(String s1){
        System.out.println(s1);
    }
}
public class InitPointString {
    static String s = "stroka";
    public static void main(String[] args) {
        new Gen("strokaGen");
        System.out.println(s);
    }
}
