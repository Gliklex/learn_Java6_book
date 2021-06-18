import java.lang.reflect.Method;

public class ThisInMethod {
    int i = 0;
    void print(){
        System.out.println("i = "+i);
    }
    ThisInMethod Method1(){
        Method2();
        return this.Method2();
    }
    ThisInMethod Method2(){
        i++;
        return this;
    }
    public static void main(String[] args) {
        ThisInMethod tIM = new ThisInMethod();
        tIM.Method1().print();
    }
}