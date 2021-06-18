class Constructor{
    Constructor(){
        System.out.println("сообщение конструктора по умолчанию");
    }
    Constructor(String s){
        System.out.println(s + " " + "сообщение конструктора по умолчанию");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
    new Constructor();
    new Constructor("Привет, я - аргумент конструктора, а это -");
    }
}
