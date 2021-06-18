class SonOfString {
    SonOfString(int mark) {
        System.out.println("SonOfString №"+mark);
    }
}
public class StaticString {
    static String sString = "Дратути";
    static int anotherPlace;
    static {
        anotherPlace = 17;
    }
    SonOfString Son1;
    SonOfString Son2;
    {
        Son1 = new SonOfString(1);
        Son2 = new SonOfString(2);
        System.out.println("Экземпляры инициализированы");
    }

    static void Printer() {
        System.out.println("sString: " + sString + ", "+ "anotherPlace: " + anotherPlace);
    }

    public static void main(String[] args) {
        new StaticString();
        Printer();
    }
}
