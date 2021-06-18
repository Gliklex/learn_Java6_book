public class WithoutConstructor {
    void print(){
        System.out.println("синтезируеься конструктор по умолчанию");
    }
    public static void main(String[] args) {
        WithoutConstructor wC = new WithoutConstructor();
        wC.print();
    }
}
